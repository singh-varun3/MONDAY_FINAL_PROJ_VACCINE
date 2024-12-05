/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Doctor.DoctorDirectory;
import Driver.DriverDirectory;
import Person.PersonDirectory;
import Role.Role;
import Role.SystemAdminRole;
import Transport.TransportDirectory;
import Vaccine.VaccineDirectory;
import VaccineCenter.VaccineCenterDirectory;
import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private PersonDirectory personDirectory;

    public TransportDirectory getTransportDirectory() {
        return transportDirectory;
    }

    public void setTransportDirectory(TransportDirectory transportDirectory) {
        this.transportDirectory = transportDirectory;
    }
    private TransportDirectory transportDirectory;
    private DriverDirectory driverDirectory;
    private DoctorDirectory doctorDirectory;
    private VaccineDirectory vaccineDirectory;
    private VaccineCenterDirectory vaccinecenterDirectory;

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public EcoSystem(PersonDirectory personDirectory,TransportDirectory transportDirectory, DriverDirectory driverDirectory, DoctorDirectory doctorDirectory, VaccineDirectory vaccineDirectory, VaccineCenterDirectory vaccinecenterDirectory) {
        this.personDirectory = personDirectory;
        this.driverDirectory = driverDirectory;
        this.doctorDirectory = doctorDirectory;
        this.vaccineDirectory = vaccineDirectory;
        this.transportDirectory = transportDirectory;
        this.vaccinecenterDirectory = vaccinecenterDirectory;
    }

    public DriverDirectory getDriverDirectory() {
        return driverDirectory;
    }

    public void setDriverDirectory(DriverDirectory driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    public VaccineCenterDirectory getVaccinecenterDirectory() {
        return vaccinecenterDirectory;
    }

    public void setVaccinecenterDirectory(VaccineCenterDirectory vaccinecenterDirectory) {
        this.vaccinecenterDirectory = vaccinecenterDirectory;
    }

//    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {
//
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
//    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    
    public static EcoSystem getBusiness() {
        return business;
    }

    private EcoSystem(){
        //super("Doordash");
       // networkList=new ArrayList<Network>();
        this.personDirectory = personDirectory;
        this.driverDirectory = driverDirectory;
        this.doctorDirectory = doctorDirectory;
        this.vaccineDirectory = vaccineDirectory;
        this.transportDirectory = transportDirectory;
        this.vaccinecenterDirectory = vaccinecenterDirectory;
        }
    
    //@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
