/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

/**
 *
 * @author akshit verma
 */

import Business.EcoSystem;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Admins.*;

public class TransportAdmin {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem ecosystem) {
        return new TransportAdminWorkAreaJPanel(userProcessContainer, ecosystem);
        
    }
}
