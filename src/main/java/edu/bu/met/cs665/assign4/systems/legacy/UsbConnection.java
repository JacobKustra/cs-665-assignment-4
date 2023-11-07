/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: UsbConnection.java
 * Description: The UsbConnection.java class implements the CustomerData_USB
 * interface access customer via the legacy USB interface.
 */


package edu.bu.met.cs665.assign4.systems.legacy;

import edu.bu.met.cs665.assign4.database.Customer;
import edu.bu.met.cs665.assign4.database.UsbCustomerDatabase;
import java.util.ArrayList;


/**
 * This is the UsbConnection class which implements the CustomerData_USB and
 * overrides the interface of how the customer's data is accessed on the USB drive.
 */
public class UsbConnection implements CustomerData_USB {

  /**
   * This is the printCustomer method which takes in the customer ID and goes through
   * the entire USB customer database, matches the ID to the right customer and prints
   * out their ID and Name.
   */
  @Override
  public void printCustomer(int customerID) {
    ArrayList<Customer> dataUsb = UsbCustomerDatabase.showAllDatabase();
    int lengthOfData = dataUsb.size();
    for (int i = 0; i < lengthOfData; i++) {
      if (dataUsb.get(i).getID() == customerID) {
        System.out.println("ID: " + dataUsb.get(i).getID() + " is Customer: "
            + dataUsb.get(i).getName());
      }
    }
  }

  /**
   * This is the getCustomer_USB method which takes in the customer ID and goes through
   * the entire USB customer database, matches the ID to the right customer and prints
   * out their full account information which also contains their email and phone number.
   */
  @Override
  public void getCustomer_USB(int customerID) {
    ArrayList<Customer> dataUsb = UsbCustomerDatabase.showAllDatabase();
    int lengthOfData = dataUsb.size();
    for (int i = 0; i < lengthOfData; i++) {
      if (dataUsb.get(i).getID() == customerID) {
        System.out.println("\nPrinting Out Customer Account Details for ID: " + customerID);
        System.out.println("Name: " + dataUsb.get(i).getName() + "\nEmail: "
            + dataUsb.get(i).getEmailAddress() + "\nNumber: "
            + dataUsb.get(i).getPhoneNumber());
      }
    }
  }

  /**
   * This is the addCustomerUsb method which adds a new customer into the USB database.
   */
  public void addCustomerUsb(Customer newCustomer) {
    UsbCustomerDatabase.addCustomer(newCustomer);
  }

  /**
   * This is the getCustomerName method returns the name of the customer that matches
   * the id number.
   */
  public String getCustomerName(int customerID) {
    ArrayList<Customer> dataUsb = UsbCustomerDatabase.showAllDatabase();
    int lengthOfData = dataUsb.size();
    String cName = null;
    for (int i = 0; i < lengthOfData; i++) {
      if (dataUsb.get(i).getID() == customerID) {
        cName = dataUsb.get(i).name;
      } else {
        cName = null;
      }
    }
    return cName;
  }

}
