/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: CustomerData_HTTPS.java
 * Description: The CustomerData_HTTPS.java interface contains the template to the
 * legacy interface get customer data over a HTTPS connection.
 */


package edu.bu.met.cs665.assign4.systems;


/**
 * This is the CustomerData_HTTPS interface which is implemented via the HttpsConnection
 * class to printCustomer and getCustomer_HTTPS via accessing the customer data on
 * the HTTPS database
 */
public interface CustomerData_HTTPS {

  /**
   * This is the printCustomer method which is implemented via the HttpsConnection
   * class to print out the customer name associated with their ID.
   */
  void printCustomer(int customerID);

  /**
   * This is the getCustomer_HTTPS method which is implemented via the HttpsConnection
   * class to print out the entire account information of the customer from their
   * associated ID number in the HTTPS database.
   */
  void getCustomer_HTTPS(int customerID);
}
