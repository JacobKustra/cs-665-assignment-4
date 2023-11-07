/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: UsbToHttpsAdapter.java
 * Description: The UsbToHttpsAdapter.java class implements the CustomerData_HTTPS
 * interface and adapts the legacy USB interface to use the new HTTPS interface.
 */

package edu.bu.met.cs665.assign4.adapter;

import edu.bu.met.cs665.assign4.database.Customer;
import edu.bu.met.cs665.assign4.database.UsbCustomerDatabase;
import edu.bu.met.cs665.assign4.systems.CustomerData_HTTPS;
import java.util.ArrayList;

/**
 * This is the UsbToHttpsAdapter class which implements the CustomerData_HTTPS and
 * overrides how the customer's data is accessed on the USB drive by allowing
 * the client to use the HTTPS interface to access it.
 */
public class UsbToHttpsAdapter implements CustomerData_HTTPS {

  private UsbCustomerDatabase databaseUsb;

  /**
   * This is the UsbToHttpsAdapter constructor method uses the USB customer database
   * and sets it equal to the databaseUSB variable.
   */
  public UsbToHttpsAdapter(UsbCustomerDatabase databaseUsb) {
    this.databaseUsb = databaseUsb;
  }

  /**
   * This is the printCustomer method which takes in the customer ID and goes through
   * the entire USB customer database, matches the ID to the right customer and prints
   * out their ID and Name.
   */
  @Override
  public void printCustomer(int customerID) {
    ArrayList<Customer> dataAdapter = databaseUsb.showAllDatabase();
    int lengthOfData = dataAdapter.size();
    for (int i = 0; i < lengthOfData; i++) {
      if (dataAdapter.get(i).getID() == customerID) {
        System.out.println("ID: " + dataAdapter.get(i).getID()
            + " is Customer: " + dataAdapter.get(i).getName());
      }
    }
  }

  /**
   * This is the getCustomer_HTTPS method which takes in the customer ID and goes through
   * the entire USB customer database, matches the ID to the right customer and prints
   * out their full account information which also contains their email and phone number
   * adapting it to work on the new HTTPs interface.
   */
  @Override
  public void getCustomer_HTTPS(int customerID) {
    ArrayList<Customer> dataAdapter = databaseUsb.showAllDatabase();
    int lengthOfData = dataAdapter.size();
    for (int i = 0; i < lengthOfData; i++) {
      if (dataAdapter.get(i).getID() == customerID) {
        System.out.println("\nPrinting Out Customer Account Details for ID: " + customerID);
        System.out.println("Name: " + dataAdapter.get(i).getName() + "\nEmail: "
            + dataAdapter.get(i).getEmailAddress() + "\nNumber: "
            + dataAdapter.get(i).getPhoneNumber());
      }
    }
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




