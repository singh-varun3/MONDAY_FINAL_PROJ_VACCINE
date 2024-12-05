/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.EcoSystem;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.*;

/**
 *
 * @author akshit verma
 */
public class SystemAdminRole extends Role {
    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem ecosystem) {
        return null;
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
        
    }
}
