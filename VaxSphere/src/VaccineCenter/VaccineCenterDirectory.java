/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaccineCenter;

import java.util.ArrayList;

/**
 *
 * @author ethangomes
 */
public class VaccineCenterDirectory {
    
    public ArrayList<VaccineCenter> getVaccineCenterList() {
        return vaccineCenterList;
    }

    public void setVaccineCenterList(ArrayList<VaccineCenter> vaccineCenterList) {
        this.vaccineCenterList = vaccineCenterList;
    }

    public VaccineCenterDirectory(ArrayList<VaccineCenter> vaccineCenterList) {
        this.vaccineCenterList = vaccineCenterList;
    }
    private ArrayList<VaccineCenter> vaccineCenterList;
    
}
