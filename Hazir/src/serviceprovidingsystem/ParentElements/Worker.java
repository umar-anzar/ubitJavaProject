/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.ParentElements;

import java.util.*;

/**
 *
 * @author Ahmed
 */
public abstract class Worker extends Person {
    private int id;
    private String cnic;
    private int experience;
    private boolean available = true, hireStatus = false;
    private double payPercentage = 0.8, rating;

    public Worker(String name, String cnic, String contactNumber, String address, Date dateofbirth, int experience){
        super(name, contactNumber, address, dateofbirth);
        this.cnic = cnic;
        this.experience = experience;
    }


    public void setHireStatus(boolean hireStatus) {
        this.hireStatus = hireStatus;
    }
    
    //FOR DATABASE
    public void setHireStatus(String hireStatus) {
        this.hireStatus = hireStatus.equals("true");
    }
    
    public void setPayPercentage(double payPercentage) {
        this.payPercentage = payPercentage;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    //For database
    public void setAvailable(String available) {
        this.available = available.equals("true");
    }
    
    public String getCnic() {
        return cnic;
    }

    public int getId() {
        return id;
    }
    
    public int getExperience() {
        return experience;
    }
    
    //For database
    public String getAvailable() {
        if(isAvailable()){
            return "true";
        } else {
            return "false";
        }
    }
    
    public boolean isHireStatus() {
        return hireStatus;
    }
    
    //For database
    public String getHireStatus() {
        if(isHireStatus()){
            return "true";
        } else {
            return "false";
        }
    }
    
    public double getPayPercentage() {
        return payPercentage;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Worker{" + "cnic=" + cnic + ", experience=" + experience + ", status=" + hireStatus + ", pay=" + payPercentage + ", rating=" + rating + '}';
    }
     
     
}
