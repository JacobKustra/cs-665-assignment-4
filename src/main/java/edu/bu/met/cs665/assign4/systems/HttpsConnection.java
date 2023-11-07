/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: HttpsConnection.java
 * Description: The HttpsConnection.java class implements the CustomerData_HTTPS
 * interface access customer via the new HTTPS interface.
 */


package edu.bu.met.cs665.assign4.systems;

import edu.bu.met.cs665.assign4.database.Customer;
import edu.bu.met.cs665.assign4.database.HttpsCustomerDatabase;
import edu.bu.met.cs665.assign4.database.UsbCustomerDatabase;
import java.util.ArrayList;


/**
 * This is the HttpsConnection class which implements the CustomerData_HTTPS and
 * overrides the interface of how the customer's data is accessed on the HTTPS drive.
 */
public class HttpsConnection implements CustomerData_HTTPS {

  /**
   * This is the printCustomer method which takes in the customer ID and goes through
   * the entire HTTPS customer database, matches the ID to the right customer and prints
   * out their ID and Name.
   */
  @Override
  public void printCustomer(int customerID) {
    ArrayList<Customer> dataHttps = HttpsCustomerDatabase.showAllDatabase();
    int lengthOfData = dataHttps.size();
    for (int i = 0; i < lengthOfData; i++) {
      if (dataHttps.get(i).getID() == customerID) {
        System.out.println("ID: " + dataHttps.get(i).getID() + " is Customer: "
            + dataHttps.get(i).getName());
      }
    }
  }

  /**
   * This is the getCustomer_HTTPS method which takes in the customer ID and goes through
   * the entire HTTPS customer database, matches the ID to the right customer and prints
   * out their full account information which also contains their email and phone number.
   */
  @Override
  public void getCustomer_HTTPS(int customerID) {
    ArrayList<Customer> dataHttps = HttpsCustomerDatabase.showAllDatabase();
    int lengthOfData = dataHttps.size();
    for (int i = 0; i < lengthOfData; i++) {
      if (dataHttps.get(i).getID() == customerID) {
        System.out.println("\nPrinting Out Customer Account Details for ID: " + customerID);
        System.out.println("Name: " + dataHttps.get(i).getName() + "\nEmail: "
            + dataHttps.get(i).getEmailAddress() + "\nNumber: "
            + dataHttps.get(i).getPhoneNumber());
      }
    }
  }

  /**
   * This is the addCustomerHttps method which adds a new customer into the HTTPS database.
   */
  public void addCustomerHttps(Customer newCustomer) {
    HttpsCustomerDatabase.addCustomer(newCustomer);
  }

  /**
   * This is the getCustomerName method returns the name of the customer that matches
   * the id number.
   */
  public String getCustomerName(int customerID) {
    ArrayList<Customer> dataUsb = HttpsCustomerDatabase.showAllDatabase();
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
