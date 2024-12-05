/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vaccine;

import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class VaccineDirectory {

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public VaccineDirectory(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
    private ArrayList<Vaccine> vaccineList;
}
