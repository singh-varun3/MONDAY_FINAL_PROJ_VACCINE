/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoSystem;
import Person.Person;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PersonRole.PersonAreaJPanel;
//import userinterface.CustomerRole.*;

/**
 *
 * @author akshit verma
 */
public class PersonRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem business) {
        Person customer = business.getPersonDirectory().getPersonByUserAccount(useraccount);
        return new PersonAreaJPanel(userProcessContainer, useraccount, business, customer);
    }
}
