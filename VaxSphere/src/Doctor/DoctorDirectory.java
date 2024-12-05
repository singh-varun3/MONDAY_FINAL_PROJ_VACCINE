/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Person.Person;
import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class DoctorDirectory {

    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory() {
        this.doctorList = doctorList;
    }
    
    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public void addDoctor(Doctor d){
        doctorList.add(d);
    }
    public Doctor getDoctorByUserAccount(UserAccount user) {
        Doctor customer = null;
        for (Doctor c: doctorList) {
            if (c.getUserAccount().equals(user))
                customer = c;
        }
        return customer;
    }

}
