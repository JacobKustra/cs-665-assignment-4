/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: UsbCustomerDatabase.java
 * Description: The UsbCustomerDatabase.java class contains the variables and methods
 * needed to create the USB customer database.
 */

package edu.bu.met.cs665.assign4.database;

import java.util.ArrayList;

/**
 * This is the UsbCustomerDatabase class which is used to generate a new USB customer
 * database.
 */
public class UsbCustomerDatabase {

  private static ArrayList<Customer> customerDatabase_USB = new ArrayList<Customer>();

  /**
   * This is the addCustomer class is used to add a new customer into the USB
   * database.
   */
  public static void addCustomer(Customer newCustomer) {
    customerDatabase_USB.add(newCustomer);
  }

  /**
   * This is the showAllDatabase class is used to return the entire USB customer
   * database.
   */
  public static ArrayList<Customer> showAllDatabase() {
    return customerDatabase_USB;
  }

}
