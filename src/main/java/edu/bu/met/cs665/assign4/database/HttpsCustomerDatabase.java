/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: HttpsCustomerDatabase.java
 * Description: The HttpsCustomerDatabase.java class contains the variables and methods
 * needed to create the HTTPS customer database.
 */

package edu.bu.met.cs665.assign4.database;

import java.util.ArrayList;

/**
 * This is the HttpsCustomerDatabase class which is used to generate a new HTTPS customer
 * database.
 */
public class HttpsCustomerDatabase {

  private static ArrayList<Customer> customerDatabase_HTTPS = new ArrayList<Customer>();

  /**
   * This is the addCustomer class is used to add a new customer into the HTTPS
   * database.
   */
  public static void addCustomer(Customer newCustomer) {
    customerDatabase_HTTPS.add(newCustomer);
  }

  /**
   * This is the showAllDatabase class is used to return the entire HTTPS customer
   * database.
   */
  public static ArrayList<Customer> showAllDatabase() {
    return customerDatabase_HTTPS;
  }

}
