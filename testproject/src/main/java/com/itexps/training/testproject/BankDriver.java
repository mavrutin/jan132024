/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.testproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BankDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        int choice;
        String address;
        String phone;
        String fname;
        String lname;
        String cust_type;
        String email;
        String gender;
        String id;
        String bus_name;
        String bus_type;

        programtitle(); //Methoth with Menu options

        System.out.println("Please select a MENU number to continue");
        menu = sc.nextInt();

        switch (menu) {
            case 1: //Add branch
                System.out.println("Add Branch");
                break;

            case 7: //Add Customer

                System.out.println("Update Customer");
                break;

            case 8: //Update Customer
                System.out.println("Update Customer");
                break;

            case 9: //Delete Customer
                System.out.println("Delete Customer");
                break;

            case 10: //View Customer
                System.out.println("View Customer");
                break;

            case 11: //Search by Customer ID
                System.out.println("Search by Customer ID");
                break;

            case 22: //Add Bank Info
                
                break;

            case 23: //Update Bank address and phone
                System.out.println("Please update Bank's Address");
                address = sc.nextLine();
                address += sc.nextLine();

                System.out.println("Please update Bank's Phone");
                phone = sc.next();

                Bank bnk23 = new Bank("1", "ITEXPS BANK", address, phone);
                System.out.println(bnk23);
                break;
     
                case 24: //View Bank details
                
                break;
            

            case 25: //Exit banking system
                System.out.println("Thank you for using TEAM BANKING SYSTEM!");
                System.out.println("Goodbye!");
                System.exit(0);
                break;

            default: // Not a valid number
                System.out.println("Invalid choice. Try again.");
                break;

        }

    }

    //This method holds all menues for the program
    static void programtitle() {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                                                            WELCOME");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TO ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                                                           TEAM--BANK");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Select from the following menu~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("      BRANCH                             CUSTOMER                                  ACCOUNT                                 EMPLOYEE                            BANK INFO");
        System.out.println("      ~~~~~~                             ~~~~~~~~                                  ~~~~~~~                                 ~~~~~~~~~                           ~~~~~~~~~");
        System.out.println("1. ADD BRANCH                      7. ADD CUSTOMER                            12. ADD ACCOUNT                         17. ADD EMPLOYEE                     22. ADD BANK DETAILS");
        System.out.println("2. UPDATE BRANCH                   8. UPDATE CUSTOMER                         13. UPDATE ACCOUNT                      18. UPDATE EMPLOYEE                  23. UPDATE BANK DETAILS");
        System.out.println("3. DELETE BRANCH                   9. DELETE CUSTOMER                         14. DELETE ACCOUNT                      19. DELETE EMPLOYEE                  24. VIEW BANK DETAILS");
        System.out.println("5. VIEW ALL BRANCHES              10. VIEW ALL CUSTOMERS                      15. VIEW ALL ACCOUNTS                   20. VIEW ALL EMPLOYEES               25. EXIT BANKING");    
        System.out.println("6. SEARCH BY BRANCH ID            11. SEARCH BY CUSTOMER ID                   16. SEARCH BY ACCOUNT ID                21. SEARCH BY EMPLOYEE ID ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}
