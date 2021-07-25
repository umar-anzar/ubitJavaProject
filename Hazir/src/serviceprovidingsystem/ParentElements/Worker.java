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
     private String cnic;
     private int experience;
     private boolean status;
     private double pay, rating;

    public Worker(String cnic, int experience, boolean status, double pay, double rating, String name, String contactNumber, String address, Date dateofbirth) {
        super(name, contactNumber, address, dateofbirth);
        this.cnic = cnic;
        this.experience = experience;
        this.status = status;
        this.pay = pay;
        this.rating = rating;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCnic() {
        return cnic;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isStatus() {
        return status;
    }

    public double getPay() {
        return pay;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Worker{" + "cnic=" + cnic + ", experience=" + experience + ", status=" + status + ", pay=" + pay + ", rating=" + rating + '}';
    }
     
     
}
