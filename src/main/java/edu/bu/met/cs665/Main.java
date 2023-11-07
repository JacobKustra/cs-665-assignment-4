/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: Main.java
 * Description: The Main.java class contains the main method, which is
 * used to start/run an example of the program.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.assign4.adapter.UsbToHttpsAdapter;
import edu.bu.met.cs665.assign4.database.Customer;
import edu.bu.met.cs665.assign4.database.UsbCustomerDatabase;
import edu.bu.met.cs665.assign4.systems.HttpsConnection;
import edu.bu.met.cs665.assign4.systems.legacy.UsbConnection;

/**
 * This is the Main class which is used to show an example of how the program can
 * be used.
 */
public class Main {

  /**
   * A main method which initiates 2 customers, one in the USB database,
   * the other in the HTTPS database and shows how the legacy USB connection works,
   * how the new HTTPS connection works and finally how the adapter works to adapts
   * that USB connection to the new HTTPS interface.
   */
  public static void main(String[] args) {
    Customer customer1 = new Customer("John Franco", "jfranco@bu.edu", "860-888-8888");
    Customer customer2 = new Customer("Phil Johnson", "phil@bu.edu", "860-999-9999");
    int id1 = customer1.getID();
    int id2 = customer2.getID();

    System.out.println("ID 1: " + id1);
    System.out.println("ID 2: " + id2);

    System.out.println("\n\nUSB Standard");
    UsbConnection usb = new UsbConnection();
    usb.addCustomerUsb(customer1);
    usb.printCustomer(id1);
    usb.getCustomer_USB(id1);

    System.out.println("\n\nUSB ADAPTER TO HTTPS");
    UsbCustomerDatabase usbData = new UsbCustomerDatabase();
    UsbToHttpsAdapter usbAdapter = new UsbToHttpsAdapter(usbData);
    usbAdapter.printCustomer(id1);
    usbAdapter.getCustomer_HTTPS(id1);

    System.out.println("\n\nHTTPS");
    HttpsConnection https = new HttpsConnection();
    https.addCustomerHttps(customer2);
    https.printCustomer(id2);
    https.getCustomer_HTTPS(id2);
  }

}
