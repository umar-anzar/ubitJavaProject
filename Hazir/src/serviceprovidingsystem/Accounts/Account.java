/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Accounts;
import java.util.*;
import serviceprovidingsystem.ParentElements.Person;

/**
 *
 * @author Ahmed
 */
public abstract class Account extends Person {
    private String password;
    
    public Account( String name, String password, String contactNumber, String address, Date dateOfBirth){
        super(name, contactNumber, address, dateOfBirth);
        this.password = password;
    }



    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" + "password=" + password + '}';
    }
    
    
    
}
