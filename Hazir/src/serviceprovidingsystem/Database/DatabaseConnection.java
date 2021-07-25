/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Database;
import java.sql.*;
import java.util.*;

/**
 *
 * @author omer
 */
public class DatabaseConnection {
    public Connection connection = null;
    public ResultSet FinalDb =null;
    public PreparedStatement pst = null;

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

    public void UPDATE(String toStringMethodCSV){
        
        try {
            Scanner record = new Scanner(toStringMethodCSV);
            String name=null,password=null,contactNumber=null,address=null,orderStatus=null;
            Long dateOfBirth=0L;
            record.useDelimiter(",");
            while (record.hasNext()) {
                record.next();//this is to remove User in ToStringMethod
                name = record.next();
                password = record.next();
                contactNumber = record.next();
                address = record.next();
                dateOfBirth = record.nextLong();
                orderStatus = record.next();
            }
        } catch (Exception e) {
        }

    }
    
    public void INSERT(String toStringMethodCSV){
        
        String sql = "INSERT INTO Users(name, password, contactNumber, address, dateOfBirth, orderStatus) VALUES(?,?,?,?,?,?)";
        
        try {
            Scanner record = new Scanner(toStringMethodCSV);
            String name=null,password=null,contactNumber=null,address=null,orderStatus=null,dateOfBirth=null;
            record.useDelimiter(",");
            while (record.hasNext()) {
                record.next();//this is to remove User in ToStringMethod
                name = record.next();
                password = record.next();
                contactNumber = record.next();
                address = record.next();
                dateOfBirth = record.next();
                orderStatus = record.next();
            }
            pst = connection.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, password);
            pst.setString(3, contactNumber);
            pst.setString(4, address);
            pst.setString(5, dateOfBirth);
            pst.setString(6, "false");
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void ConnectingDataBase(){
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:database\\databaseFile.db");
        } catch (Exception e) {
        }
        
    }
}
