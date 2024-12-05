/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoSystem;
import Doctor.Doctor;
import Person.Person;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorWorkArea.DoctorWorkAreaJPanel;
import userinterface.PersonRole.PersonAreaJPanel;

/**
 *
 * @author akshit verma
 */
public class DoctorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem business) {
        Doctor customer = business.getDoctorDirectory().getDoctorByUserAccount(useraccount);
        return new DoctorWorkAreaJPanel(userProcessContainer, useraccount, business, customer);
    }
}
