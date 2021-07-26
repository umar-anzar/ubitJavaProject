/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Accounts;
import java.util.*;
import serviceprovidingsystem.AdressWindow.*;
import serviceprovidingsystem.ParentElements.*;
import serviceprovidingsystem.Database.DatabaseConnection;

/**
 *
 * @author Ahmed
 */
public class User extends Account {
    private Boolean orderStatus = false;
    private double cost = 0.0;
    public User(String name, String password, String contactNumber, String address, Date dateOfBirth){
        super(name, password, contactNumber, address, dateOfBirth);
    }

    public String isOrderStatus() {
        if(orderStatus){
            return "true";
        }
        return "false";
    }

    public void setOrderStatus(String orderStatus) {
        if(orderStatus.equals("true")){
            this.orderStatus = true;
        } else {
            this.orderStatus = false;
        }
    }
    
    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    
    public void setAddress(String address){
        super.setAddress(address);
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public double getCost() {
        return cost;
    }

    
    public String getAddress() {
        return super.getAddress();
    }

    public void giveTip(Worker worker, double tip){
        
    }
    //toSting is like CSV comma separated
    @Override
    public String toString() {
        return "User,"+super.getName()+","+super.getPassword()+","
                +super.getContactNumber()+","+super.getAddress()+","+
                super.getDate()+","+isOrderStatus();
    }
    public static void main(String[] args) {
        User a= new User("aasd", "anas123", "03423", null, new Date());
        a.setOrderStatus("false");
        System.out.println(a.toString());
        System.out.println(System.currentTimeMillis());
        DatabaseConnection database = new DatabaseConnection();
        //database.INSERT(a.toString());
    }
 
}
