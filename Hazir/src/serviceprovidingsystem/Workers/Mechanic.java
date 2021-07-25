/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.Workers;
import java.util.*;
import serviceprovidingsystem.ParentElements.Worker;

/**
 *
 * @author Ahmed
 */
public class Mechanic extends Worker {
    
        public Mechanic(String cnic, int experience, boolean status, double pay, double rating, String name, String contactNumber, String address, Date dateofbirth) {
        
        super(cnic, experience, status, pay, rating, name, contactNumber, address, dateofbirth);
   
    }
    
}
