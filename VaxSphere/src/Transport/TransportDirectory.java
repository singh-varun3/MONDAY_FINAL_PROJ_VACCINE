/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport;

import Driver.Driver;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ethangomes
 */
public class TransportDirectory {
    
    public ArrayList<Transport> getTransportList() {
        return transportList;
    }

    public void setTransportList(ArrayList<Transport> transportList) {
        this.transportList = transportList;
    }
    private ArrayList<Transport> transportList;
    
    public Transport addNewCar(){
    Transport car = new Transport();
    transportList.add(car);
    return car;
    }
    
    public Transport getRestaurantByAdmin(UserAccount user) {
        Transport restaurant = null;
        for (Transport r : transportList) {
            if(r.getAdmin().equals(user))
                restaurant = r;
        }
        return restaurant;
    }
    
    public Transport getRestaurantByDeliveryMan(UserAccount user) {
        Transport restaurant = null;
        for (Transport r : transportList) {
            for(Driver man: r.getDriverList()) {
               if(man.getUserAccount().equals(user))
                restaurant = r; 
            }  
        }
        return restaurant;
    }
    
}
