/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.testproject;

/**
 *
 * @author Lenovo
 */
public class IndividualCustomer extends Customer {
        private String email;
        private String gender;

    @Override
    public String toString() {
        return email + ", " + gender;
    }
    
    public IndividualCustomer(String email, String gender, String cust_id, String cust_fname, String cust_lname, String cust_type, String cust_address, String cust_phone) {
        super(cust_id, cust_fname, cust_lname, cust_type, cust_address, cust_phone);
        this.email = email;
        this.gender = gender;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
        

}
   