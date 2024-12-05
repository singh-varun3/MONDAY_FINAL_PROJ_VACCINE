/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import UserAccount.UserAccount;

/**
 *
 * @author varun
 */
public class Person {
    private String fname;
    private String lname;
    private String phoneNumber;
    private String email;
    private String address;
    private String sex;
    private String ID;
    private String age;
    private String username;
    private String password;
    private String status;
    private String Role;
    private String Vaccination_Center;
    private String adminType;

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }
    
    public Person(String id, String fname, String lname, String  CenterID){
        this.ID = id;
        this.fname = fname;
        this.lname = lname;
        this.ID = CenterID;
    }
    public Person(){}

    public String getTransportCompanyID() {
        return TransportCompanyID;
    }

    public void setTransportCompanyID(String TransportCompanyID) {
        this.TransportCompanyID = TransportCompanyID;
    }
    private String TransportCompanyID;
    

    public String getVaccination_Center() {
        return Vaccination_Center;
    }

    public void setVaccination_Center(String Vaccination_Center) {
        this.Vaccination_Center = Vaccination_Center;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private UserAccount userAccount;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
