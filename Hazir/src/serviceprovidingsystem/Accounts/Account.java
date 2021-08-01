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
    
    public Account( String name, String password, String contactNumber, Date dateOfBirth){
        super(name, contactNumber, dateOfBirth);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "password=" + password + '}';
    }
    
    
    
}
