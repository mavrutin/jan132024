/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.testproject;

/**
 *
 * @author Lenovo
 */
public class Customer {
    private String cust_id;
    private String cust_fname;
    private String cust_lname;
    private String cust_type; //Individual vs. Business
    private String cust_address;
    private String cust_phone; 

    @Override
    public String toString() {
        return cust_id + ", " + cust_fname + ", " + cust_lname + ", " + cust_type + ", " + cust_address + ", " + cust_phone;
    }

    public Customer(String cust_id, String cust_fname, String cust_lname, String cust_type, String cust_address, String cust_phone) {
        this.cust_id = cust_id;
        this.cust_fname = cust_fname;
        this.cust_lname = cust_lname;
        this.cust_type = cust_type;
        this.cust_address = cust_address;
        this.cust_phone = cust_phone;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_fname() {
        return cust_fname;
    }

    public void setCust_fname(String cust_fname) {
        this.cust_fname = cust_fname;
    }

    public String getCust_lname() {
        return cust_lname;
    }

    public void setCust_lname(String cust_lname) {
        this.cust_lname = cust_lname;
    }

    public String getCust_type() {
        return cust_type;
    }

    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    
    
    
}

   