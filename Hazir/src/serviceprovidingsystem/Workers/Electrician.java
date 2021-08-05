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
public class Electrician extends Worker {

    private double payPercentage = 0.75;
    
    public Electrician(String name, String cnic, String contactNumber, int experience, Date dateofbirth) {
        super(name, cnic, contactNumber, experience, dateofbirth);
    }

    public double pay() {
        
        super.setPaidTotal(super.getPaidTotal() + super.getPocket() * payPercentage);
        double owner_return = super.getPocket() - super.getPocket() * payPercentage;
        super.setPocket(0);
        return owner_return;

    }
    
}
