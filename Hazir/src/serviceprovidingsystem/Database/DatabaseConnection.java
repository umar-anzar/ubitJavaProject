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
import serviceprovidingsystem.Accounts.*;
import serviceprovidingsystem.Workers.*;

/**
 *
 * @author omer
 */
    public class DatabaseConnection {
    public Connection connection = null;
    public ResultSet FinalDb =null;
    public PreparedStatement pst = null;
    public Statement st = null;
    
    //User aggregation
    public User currentUser;

    public DatabaseConnection(){
        ConnectingDataBase();
        //String sql = "select *from Users";
        //pst = connection.prepareStatement(sql);
        //FinalDb = pst.executeQuery();

    }
    //INCASE WE CLOSE THE CONNECTION B/W SOME WINDOW SO WE CAN AGAIN CONNECT IT.
    public void connectionOn(){
        ConnectingDataBase();
    }
    //INCASE WE HAVE TO CLOSE CONNECTION EVERTIME WE END THE PROGRAM.
    public void connectionOff(){
        try {
            this.connection.close();
        } catch (Exception e) {
        }

    }
    
    
    public  boolean EXIST(String Username)  {
        connectionOn();
        try {
            String sql = "select name FROM Users WHERE name ='" + Username + "'";
            
            st = connection.createStatement();
            FinalDb = st.executeQuery(sql);
            connectionOff();
            return FinalDb.isBeforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        connectionOff();
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
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("USER UPDATED");
        connectionOff();
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
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("USER INSERTED");
        connectionOff();
    }
    
     public boolean LOGIN(String name , String password) {
        connectionOn();
     
        try {

            String sql = "select * from Users where name=? and password=? ";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, name);
            pst.setString(2, password);
            
            
            
            ResultSet FinalDb = pst.executeQuery();
            
            if (name == "admin" && password=="admin"){
            
                // new frame for owner
                
            }else   { if (FinalDb.next()){
                //1name,2password,3contactNumber,4address,5dateOfRegistration,6orderStatus,7cost,8address,9workerId
                System.out.println("User is working");
                currentUser = new User(FinalDb.getString(1), FinalDb.getString(2), FinalDb.getString(3), new Date());
                currentUser.setAddress(FinalDb.getString(4));
                currentUser.setOrderStatus(FinalDb.getString(6));
                currentUser.setCost(FinalDb.getDouble(7));
                currentUser.setAddressLink(FinalDb.getString(8));
                
//                if(currentUser.hiredWorker != null) {
//                    String workerName = currentUser.hiredWorker.getClass().getSimpleName();
//                    switch (workerName) {
//                        case "Electrician":
//                            //currentUser.hiredWorker = new Electrician(FinalDb.getInt(9),);
//                            break;
//                        case "EventManager":
//                            //currentUser.hiredWorker = new EventManager(FinalDb.getInt(9),);
//                            break;
//                        case "Labour":
//                            //currentUser.hiredWorker = new Labour(FinalDb.getInt(9),);
//                            break;
//                        case "Mechanic":
//                            //currentUser.hiredWorker = new Mechanic(FinalDb.getInt(9),);
//                            break;
//                        case "Plumber":
//                            //currentUser.hiredWorker = new Plumber(FinalDb.getInt(9),);
//                            break;
//                        default:
//                            break;
//                    }
//                    
//                }

                System.out.println(currentUser.toString());
                connectionOff();
                return true;
                // available in database
            }else {
            
                System.out.println("User not working");
                // not available in database
                connectionOff();
                return false;
            }
            
            }

               
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            System.out.println(e);
        }
        connectionOff();
        return false;
    }
    
    
    
    
    
    
    
    
    public void ConnectingDataBase(){
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:database\\databaseFile.db");
        } catch (Exception e) {
        }
        
    }
}
