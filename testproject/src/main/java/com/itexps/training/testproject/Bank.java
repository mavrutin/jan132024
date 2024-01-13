/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.testproject;

/**
 *
 * @author Lenovo
 */
public class Bank {
    private String bank_id;
    private String bank_name;
    private String bank_address;
    private String bank_phone;

    public Bank(String bank_id, String bank_name, String bank_address, String bank_phone) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.bank_address = bank_address;
        this.bank_phone = bank_phone;
    }

    @Override
    public String toString() {
        return  bank_name + ", " +  bank_address + ", " + bank_phone;
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_address() {
        return bank_address;
    }

    public void setBank_address(String bank_address) {
        this.bank_address = bank_address;
    }

    public String getBank_phone() {
        return bank_phone;
    }

    public void setBank_phone(String bank_phone) {
        this.bank_phone = bank_phone;
    }
    
    
}
