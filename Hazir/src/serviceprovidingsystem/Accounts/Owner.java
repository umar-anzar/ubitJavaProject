/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Accounts;
import java.util.*;

/**
 *
 * @author Ahmed
 */
public class Owner extends Account {
    
    private double totalAmount = 0.0;
    
    public Owner(String name, String password, String contactNumber, Date dateOfBirth){
        super(name, password, contactNumber, dateOfBirth);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    
    
    public String toString() {
        return "User,"+super.getName()+","+super.getPassword()+","
                +super.getContactNumber()+","+super.getAddress()+","+
                super.getDate();
    }
    
}
