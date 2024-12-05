/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Employee.Employee;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akshit verma
 */
public class UserAccountDirectory {
    
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount user : userAccountList)
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        return null;
    }
    
    public UserAccount createUser(String username, String password,Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUser(String username) {
        for (UserAccount user : userAccountList) {
             if (user.getUsername().equals(username)) {
               userAccountList.remove(user);
               return;
            }
        }
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
