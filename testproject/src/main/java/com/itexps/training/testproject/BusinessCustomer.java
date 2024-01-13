/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.testproject;

/**
 *
 * @author Lenovo
 */
public class BusinessCustomer extends Customer {

    private String bus_name;
    private String bus_type;

    @Override
    public String toString() {
        return bus_name + ", " + bus_type;
    }

    public BusinessCustomer(String bus_name, String bus_type, String cust_id, String cust_fname, String cust_lname, String cust_type, String cust_address, String cust_phone) {
        super(cust_id, cust_fname, cust_lname, cust_type, cust_address, cust_phone);
        this.bus_name = bus_name;
        this.bus_type = bus_type;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getBus_type() {
        return bus_type;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
    }
    
    

}