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
public abstract class Person {
    private String name, contactNumber, address;
    private Date dateOfBirth;

    public Person(String name, String contactNumber, String address, Date dateOfBirth) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDate() {
        return dateOfBirth.toString();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", contactNumber=" + contactNumber + ", address=" + address + ", date=" + dateOfBirth + '}';
    }
    
}

