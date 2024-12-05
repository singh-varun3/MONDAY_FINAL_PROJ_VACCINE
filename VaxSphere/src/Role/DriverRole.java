/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoSystem;
import Doctor.Doctor;
import Driver.Driver;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DriverWorkArea.DriverWorkAreaJPanel;
import userinterface.PersonRole.PersonAreaJPanel;

/**
 *
 * @author akshit verma
 */
public class DriverRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem business) {
        Driver customer = business.getDriverDirectory().getDriverByUserAccount(useraccount);
        return new DriverWorkAreaJPanel(userProcessContainer, useraccount, business, customer);
    }
}
