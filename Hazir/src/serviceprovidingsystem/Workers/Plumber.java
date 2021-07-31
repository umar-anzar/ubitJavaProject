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
public class Plumber extends Worker {
    
    public Plumber(int id, String name, String cnic, String contactNumber, String address, Date dateofbirth, int experience) {
        super(id, name, cnic, contactNumber, address, dateofbirth, experience);
    }
    

}
