/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Driver;

import Doctor.Doctor;
import UserAccount.UserAccount;
import java.util.ArrayList;
import DatabaseConnection.*;

/**
 *
 * @author varun
 */
public class DriverDirectory {

    private ArrayList<Driver> driverList;
    
    public DriverDirectory() {
        this.driverList = driverList;
    }
    
    public void addDriver(Driver d){
        driverList.add(d);
    }
    
    public ArrayList<Driver> getDriverList() {
        DataConn  dc = new DataConn();
        driverList = dc.getDrivers();
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }
    public DriverDirectory(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }
    public Driver getDriverByUserAccount(UserAccount user) {
        Driver customer = null;
        for (Driver c: driverList) {
            if (c.getUserAccount().equals(user))
                customer = c;
        }
        return customer;
    }
}
