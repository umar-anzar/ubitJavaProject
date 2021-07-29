/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Accounts;
import java.util.*;
import serviceprovidingsystem.ParentElements.*;
import serviceprovidingsystem.Database.DatabaseConnection;

/**
 *
 * @author Ahmed
 */
public class User extends Account {
    public Boolean orderStatus = false;
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
        this.orderStatus = orderStatus.equals("true");
    }
    
    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
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

    @Override
    public String toString() {
        return "User{" + "orderStatus=" + orderStatus + ", addressLink=" + super.getAddress() + ", cost=" + cost + '}';
    }
   
    public static void main(String[] args) {
        User a= new User("omer", "omer123", "03333333333", null, new Date());
        a.setOrderStatus("false");
        DatabaseConnection database = new DatabaseConnection();
        database.currentUser = a;
        database.INSERT_USER();
    }
 
}
