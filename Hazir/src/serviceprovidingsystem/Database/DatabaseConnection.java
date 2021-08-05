/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Database;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import serviceprovidingsystem.Accounts.*;
import serviceprovidingsystem.ParentElements.Worker;
import serviceprovidingsystem.Workers.*;

/**
 *
 * @author omer
 */
public class DatabaseConnection {
    
    private Connection connection = null;
    private ResultSet FinalDb =null;
    private PreparedStatement pst = null;
    private Statement st = null;
    
    
    //aggregation
    public User currentUser;
    public Owner owner;
    public Worker worker;
    
    
    //WorkerSelection
        private boolean isElectrician = false;
        private boolean isLabour = false;
        private boolean isEventManager = false;
        private boolean isMechanic = false;
        private boolean isPlumber = false;

    public DatabaseConnection(){
        //ConnectingDataBase();
        //String sql = "select *from Users";
        //pst = connection.prepareStatement(sql);
        //FinalDb = pst.executeQuery();

    }
    
    //WORKER SELECTION BOOLEAN
    
    public void setAllWorkers(boolean electrician, boolean mechanic, boolean plumber, boolean eventManager, boolean labour) {
        
        this.isElectrician = electrician;
        this.isEventManager = eventManager;
        this.isMechanic = mechanic;
        this.isLabour = labour;
        this.isPlumber = plumber;
        
    }
    
    //ConnectingDatabase functions---------------------------------------------
    private void ConnectingDataBase(){
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:database\\databaseFile.db");
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        }

    }
    
    //OPEN THE CONNECTION IN FUNCTIONS OF DATABASE
    private void connectionOn(){
        
        ConnectingDataBase();
        
    }
    
    //CLOSE THE CONNECTION IN FUNCTIONS OF DATABASE
    private void connectionOff(){
        
        try {
            this.connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    //USER WINDOW FUNCTIONS----------------------------------------------------
    public boolean EXIST(String Username)  {
        
        connectionOn();
        try {
            String sql = "select name FROM Users WHERE name ='" + Username + "'";
            
            st = connection.createStatement();
            FinalDb = st.executeQuery(sql);
            return FinalDb.isBeforeFirst();
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
            
        } finally {
            
            connectionOff();
            
        }

    }
     
    public boolean LOGIN(String name , String password) {
        
        connectionOn();
     
        try {

            String sql = "select * from Users where name=? and password=? ";
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, name);
            pst.setString(2, password);
            
            
            
            FinalDb = pst.executeQuery();
            
            if (name.equals("admin") && password.equals("admin")){
                // new frame for owner
                owner = new Owner(FinalDb.getString(1), FinalDb.getString(2), FinalDb.getString(3), null);
                owner.setTotalAmount(FinalDb.getDouble(7));
                return true;
                
            } else { 
                
                if (FinalDb.next()){
                    
                    //1name,2password,3contactNumber,4address,5dateOfRegistration,6orderStatus,7cost,8address,9workerId
                    System.out.println("User is working");
                    currentUser = new User(FinalDb.getString(1), FinalDb.getString(2), FinalDb.getString(3), new Date());
                    currentUser.setAddress(FinalDb.getString(4));
                    currentUser.setOrderStatus(FinalDb.getString(6));
                    currentUser.setCost(FinalDb.getDouble(7));
                    currentUser.setAddressLink(FinalDb.getString(8));
                    
                    // if id isn't 0 then it means it has worker hired of that id
                    
                    if(FinalDb.getInt(9) != 0) {

                        GET_WORKER_BY_ID(FinalDb.getInt(9));//creates worker by id
                        currentUser.hiredWorker = worker; //then saving it in attribute of user
                        worker = null;

                    } else {
                        //noting id in user database table is already 0
                        //no worker is created cuz not hired
                    }
                    
                    System.out.println(currentUser.toString());
                    return true;
                    // available in database
                    
                }else {

                    System.out.println("User not working,not available in database");
                    // not available in database
                    return false;
                }
            
            }

               
        } catch (SQLException ex) {
            
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (Exception e){
            
            System.out.println(e);
            
        } finally {
            
           connectionOff(); 
           
        }
        
        return false;
        
    }
     
    public void UPDATE_USER(){
        
        connectionOn();
        String sql = "UPDATE Users SET password = ? , contactNumber = ? , address = ? , orderStatus = ? , cost = ? , addressLink = ? , workerId = ? WHERE name = ?";
        
        try{
            
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, currentUser.getPassword());
            pst.setString(2, currentUser.getContactNumber());
            pst.setString(3, currentUser.getAddress());
            pst.setString(4, currentUser.getOrderStatus());
            pst.setDouble(5, currentUser.getCost());
            pst.setString(6, currentUser.getAddressLink());
            
            //if worker is hired and created in current user then id is saved in FIELD of user
            if (currentUser.hiredWorker != null) {
                pst.setInt(7, currentUser.hiredWorker.getId());
            } else {
                pst.setInt(7, 0);
            }
            
            pst.setString(8, currentUser.getName());
            pst.executeUpdate();//send to database
            
            System.out.println("USER UPDATED");
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        } finally {
            
            connectionOff();
            
        }

    }

    public void INSERT_USER(){
        
        connectionOn();
        String sql = "INSERT INTO Users(name, password, contactNumber, address, dateOfRegisteration, orderStatus, cost, workerId) VALUES(?,?,?,?,?,?,?,?)";
        
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, currentUser.getName());
            pst.setString(2, currentUser.getPassword());
            pst.setString(3, currentUser.getContactNumber());
            pst.setString(4, currentUser.getAddress());
            pst.setString(5, currentUser.getDate());
            pst.setString(6, currentUser.getOrderStatus());
            pst.setDouble(7, currentUser.getCost());
            pst.setInt(8, 0);//workerid
            pst.executeUpdate();
            
            System.out.println("USER INSERTED");
            
        } catch (Exception e) {
            
            System.out.println(e);
            System.out.println("NOT INSERTED");
            
        } finally {
            
           connectionOff(); 
           
        }
        
        
    }
    
    private void settingWorkerInGetWorkerById() { //used in GET_WORKER_BY_ID
        
        try {
            worker.setId(FinalDb.getInt(1));
            worker.setAddressLink(FinalDb.getString(8));
            worker.setRating(FinalDb.getDouble(9));
            worker.setHireStatus(FinalDb.getString(10));
            worker.setAvailable(FinalDb.getString(11));
            worker.setPocket(FinalDb.getDouble(12));
            worker.setPaidTotal(FinalDb.getDouble(13));
            
        } catch (Exception ex) {
            
            System.out.println(ex);
            
        }
    }
    
    public void GET_WORKER_BY_ID(int id) { //used in login
        
        connectionOn();
        //1id,2profession,3name,4cnic,5contactNumber,6experience,7date,8addressLink,9rating,10hireStatus,11available,12pocket,13paidTotal
        
        try {
            String sql = "SELECT * FROM Workers WHERE id ='" + id + "'";
            st = connection.createStatement();
            FinalDb = st.executeQuery(sql);
      
            
            //SWITCH ON PROFESSIONS ON FIELD 2
            switch(FinalDb.getString(2)){
                case "Electrician" -> {
                    worker = new Electrician(FinalDb.getString(3),FinalDb.getString(4),FinalDb.getString(5),FinalDb.getInt(6),null);
                    settingWorkerInGetWorkerById();
                }
                case "EventManager" -> {
                    worker = new EventManager(FinalDb.getString(3),FinalDb.getString(4),FinalDb.getString(5),FinalDb.getInt(6),null);
                    settingWorkerInGetWorkerById();
                }
                case "Labour" -> {
                    worker = new Labour(FinalDb.getString(3),FinalDb.getString(4),FinalDb.getString(5),FinalDb.getInt(6),null);
                    settingWorkerInGetWorkerById();
                }
                case "Mechanic" -> {
                    worker = new Mechanic(FinalDb.getString(3),FinalDb.getString(4),FinalDb.getString(5),FinalDb.getInt(6),null);
                    settingWorkerInGetWorkerById();
                }
                case "Plumber" -> {
                    worker = new Plumber(FinalDb.getString(3),FinalDb.getString(4),FinalDb.getString(5),FinalDb.getInt(6),null);
                    settingWorkerInGetWorkerById();
                }
                default -> {
                }
            }
            
            System.out.println("GetWorkerById");
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        } finally {
            
            connectionOff();
            
        }
        
    }

    public void UPDATE_WORKER(Worker w) {
        //1id,2profession,3name,4cnic,5contactNumber,6experience,7date,8addressLink,9rating,10hireStatus,11available,12pocket,13paidTotal
        
        connectionOn();
        
        try {
            String sql = "UPDATE Workers SET addressLink = ? , rating = ? , hireStatus = ? , available = ? , pocket = ? , paidTotal = ? WHERE id = ? ";
            
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, w.getAddressLink());
            pst.setDouble(2, w.getRating());
            pst.setString(3, w.getHireStatus());
            pst.setString(4, w.getAvailable());
            pst.setDouble(5, w.getPocket());
            pst.setDouble(6, w.getPaidTotal());
            pst.setInt(7, w.getId());
            pst.executeUpdate();
            
            System.out.println("Update Worker");
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        } finally {
            
            connectionOff();
        }
    }
    
    public boolean GET_SINGLE_WORKER_BY_PROFESSION() {
        connectionOn();
        
        boolean workerAvailable = false;
        
        String profession = ((isElectrician)? "Electrician" : "") + ((isLabour)? "Labour" : "") + ((isEventManager)? "EventManager" : "")
                + ((isMechanic)? "Mechanic" : "") + ((isPlumber)? "Plumber" : "");
        
       
        String sql = "SELECT * from Workers WHERE profession = '"+ profession +"' and available = 'true' ";
        
        
        try {
            pst = connection.prepareStatement(sql);
            FinalDb = pst.executeQuery();
            workerAvailable = FinalDb.next();
            int id = FinalDb.getInt("id");
            connectionOff();
            
            GET_WORKER_BY_ID(id);
            
            currentUser.hiredWorker = worker;
            worker = null;
            
            return workerAvailable;
        
        } catch (Exception e) {
            
            System.out.println(e);
            return workerAvailable;
        
        } 
    }
    
    
    //OWNER WINDOW FUNCTIONS---------------------------------------------------
    
    public void UpdateWorkerTable(JTable table){
    
        connectionOn();
        try {

            String sql = "select * from Workers";
            pst = connection.prepareStatement(sql);
            FinalDb = pst.executeQuery();

            //Adding all element of database worker(Table)
            System.out.println("TABLE UPDATED");
            table.setModel(DbUtils.resultSetToTableModel(FinalDb));

        } catch (Exception ex) {

           System.out.println(ex);

        } finally {

           connectionOff();

        }

    }
    
    public void INSERT_WORKER(JTable table){
        connectionOn();
          try {
              String sql = "Insert into Workers (profession,name,cnic,contactNumber,experience,dateOfRegisteration,rating,hireStatus,available,pocket,paidTotal) values (?,?,?,?,?,?,?,?,?,?,?)";
              pst = connection.prepareStatement(sql);
              
              
              pst.setString(1, worker.getProfession());
              pst.setString(2, worker.getName());
              pst.setString(3, worker.getCnic());
              pst.setString(4, worker.getContactNumber());
              pst.setInt(5, worker.getExperience());
              pst.setString(6, worker.getDate());
              pst.setDouble(7, worker.getRating());
              pst.setString(8, worker.getHireStatus());
              pst.setString(9, worker.getAvailable());
              pst.setDouble(10, worker.getPocket());
              pst.setDouble(11, worker.getPaidTotal());
              
              pst.execute();
              
              
              UpdateWorkerTable(table);
              
          } catch (Exception ex) {
              System.out.println(ex);
          } finally {
              connectionOff();
          }

    }
   
    public void DELETE_USER(JTable table) {
        
        connectionOn();
        try {
           int row_of_table = table.getSelectedRow();
            int Row_click = (int) (table.getModel().getValueAt(row_of_table, 0));


            String sql = "Delete from Workers where id = ? ";

            pst = connection.prepareStatement(sql);

            pst.setInt(1, Row_click);

            pst.execute();
            
            UpdateWorkerTable(table);
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        } finally {
            
            connectionOff();
            
        }
    }

    public void UPDATE_HIRE_STATUS(JTable table){
        
        connectionOn();
        ArrayList<Integer> id_Array = new ArrayList<>();
    
        String sql = "Select id from Workers where hireStatus = 'true'";
        
        try {
            pst = connection.prepareStatement(sql);
            FinalDb = pst.executeQuery();
            
            while(FinalDb.next()){
            
                id_Array.add(FinalDb.getInt("id"));
            }
            
            System.out.println(id_Array.toString());
            
            ArrayList<Worker> workerArrayList = new ArrayList<>();
            
            for (int i = 0; i < id_Array.size(); i++) {
                int id = (int) id_Array.get(i);
                GET_WORKER_BY_ID(id);
                workerArrayList.add(worker);
            }
            
            for (int i = 0; i < workerArrayList.size(); i++) {
                workerArrayList.get(i).setHireStatus("false");
                UPDATE_WORKER(workerArrayList.get(i));
            }
            
            UpdateWorkerTable(table);
            
            
            
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            connectionOff();
        }
        
    }
    
    public void refreshingOwnerTotalField(JTextField textField) {
        
        textField.setText(Double.toString(owner.getTotalAmount()));
        
    }
    
    public void PAY_WORKER(JTable table, JTextField textField) {
        connectionOn();
        ArrayList<Integer> id_Array = new ArrayList<>();
    
        String sql = "Select id from Workers where pocket != 0 ";
        
        try {
            pst = connection.prepareStatement(sql);
            FinalDb = pst.executeQuery();
            
            while(FinalDb.next()){
            
                id_Array.add(FinalDb.getInt("id"));
            }
            
            System.out.println(id_Array.toString());
            
            ArrayList<Worker> workerArrayList = new ArrayList<>();
            
            for (int i = 0; i < id_Array.size(); i++) {
                int id = (int) id_Array.get(i);
                GET_WORKER_BY_ID(id);
                workerArrayList.add(worker);
            }
            
            double total=0;
            for (int i = 0; i < workerArrayList.size(); i++) {
                total += workerArrayList.get(i).pay();
                UPDATE_WORKER(workerArrayList.get(i));    
            }
            
            System.out.println(total);
            
            //UPDATE OWNER
            UpdateWorkerTable(table);
            
            owner.setTotalAmount(owner.getTotalAmount() + total);
            UPDATE_OWNER();
            
            refreshingOwnerTotalField(textField);
            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            
        }
    }
    
    public void UPDATE_OWNER() {
        
        connectionOn();
        String sql = "UPDATE Users SET cost = ? WHERE name = 'admin' ";
        try {
            pst = connection.prepareStatement(sql);
            pst.setDouble(1, owner.getTotalAmount());
            pst.executeUpdate();
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        } finally {
            
            connectionOff();
            
        }
    }

}
