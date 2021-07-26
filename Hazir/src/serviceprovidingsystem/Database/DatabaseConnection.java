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
    public void setTonull(){
        
        currentUser = null;
    }
    //INCASE WE CLOSE THE CONNECTION B/W SOME WINDOW SO WE CAN AGAIN CONNECT IT.
//    public void connectionOn(){
//        ConnectingDataBase();
//    }
//    //INCASE WE HAVE TO CLOSE CONNECTION EVERTIME WE END THE PROGRAM.
//    public void connectionOff(){
//        try {
//            this.connection.close();
//        } catch (Exception e) {
//        }
//
//    }
    
    
    public  boolean Exist(String Username)  {

        try {
            String sql = "select name FROM Users WHERE name ='" + Username + "'";
            
            st = connection.createStatement();
            FinalDb = st.executeQuery(sql);
            return FinalDb.isBeforeFirst();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
     
    
    public void UPDATE_USER(){

        String sql = "UPDATE Users SET password = ? , contactNumber = ? , address = ? , orderStatus = ? , cost = ? WHERE name = ?";
        
        try{
            pst = connection.prepareStatement(sql);
            
            pst.setString(1, currentUser.getPassword());
            pst.setString(2, currentUser.getContactNumber());
            pst.setString(3, currentUser.getAddress());
            pst.setString(4, currentUser.isOrderStatus());
            pst.setDouble(5, currentUser.getCost());
            pst.setString(6, currentUser.getName());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    
    public void INSERT_USER(){

        String sql = "INSERT INTO Users(name, password, contactNumber, address, dateOfRegisteration, orderStatus, cost) VALUES(?,?,?,?,?,?,?)";
        
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, currentUser.getName());
            pst.setString(2, currentUser.getPassword());
            pst.setString(3, currentUser.getContactNumber());
            pst.setString(4, currentUser.getAddress());
            pst.setString(5, currentUser.getDate());
            pst.setString(6, currentUser.isOrderStatus());
            pst.setDouble(7, currentUser.getCost());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
     public boolean Login(String name , String password) {
        
     
        try {

            String sql = "select * from Users where name=? and password=? ";
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, name);
            pst.setString(2, password);
            
            
            
            ResultSet FinalDb = pst.executeQuery();
            
            if (name == "Admin" && password=="Admin"){
            
                // new frame for owner
                
            }else   { if (FinalDb.next()){
            
                System.out.println("User is working");
                currentUser = new User(FinalDb.getString(1), FinalDb.getString(2), FinalDb.getString(3), FinalDb.getString(4), new Date());
                currentUser.toString();
                return true;
                // available in database
            }else {
            
                System.out.println("User not working");
                // not available in database
                return false;
            }
            
            }

               
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            System.out.println(e);
        }
    
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
