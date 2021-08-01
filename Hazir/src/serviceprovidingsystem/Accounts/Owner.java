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
    
    public Owner(String name, String password, String contactNumber, Date dateOfBirth){
        super(name, password, contactNumber, dateOfBirth);
    }
    public String toString() {
        return "User,"+super.getName()+","+super.getPassword()+","
                +super.getContactNumber()+","+super.getAddress()+","+
                super.getDate();
    }
    /*public static void main(String[] args) {
        Owner a= new Owner("abc", "...", "03423", "asdsa,adsad", new Date());
        
        System.out.println(a.toString());
    }*/
}
