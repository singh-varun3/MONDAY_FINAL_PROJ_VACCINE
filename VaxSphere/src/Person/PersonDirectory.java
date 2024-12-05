/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public PersonDirectory() {
        personList = new ArrayList<Person>();
    }
        public Person getPersonByUserAccount(UserAccount user) {
        Person customer = null;
        for (Person c: personList) {
            if (c.getUserAccount().equals(user))
                customer = c;
        }
        return customer;
    }
    
}
