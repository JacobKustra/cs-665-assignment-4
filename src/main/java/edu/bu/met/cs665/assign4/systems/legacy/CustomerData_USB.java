/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: CustomerData_USB.java
 * Description: The CustomerData_USB.java interface contains the template to the
 * legacy interface get customer data over a USB connection.
 */


package edu.bu.met.cs665.assign4.systems.legacy;

/**
 * This is the CustomerData_USB interface which is implemented via the UsbConnection
 * class to printCustomer and getCustomer_USB via accessing the customer data on
 * the USB database
 */
public interface CustomerData_USB {

  /**
   * This is the printCustomer method which is implemented via the UsbConnection
   * class to print out the customer name associated with their ID.
   */
  void printCustomer(int customerID);

  /**
   * This is the getCustomer_USB method which is implemented via the UsbConnection
   * class to print out the entire account information of the customer from their
   * associated ID number in the USB database.
   */
  void getCustomer_USB(int customerID);
}
