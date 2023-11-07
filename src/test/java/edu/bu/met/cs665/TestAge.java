/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: TestAge.java
 * Description: The TestAge.java class contains all of
 * my unit tests for the program.
 */


package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.assign4.adapter.UsbToHttpsAdapter;
import edu.bu.met.cs665.assign4.database.Customer;
import edu.bu.met.cs665.assign4.database.UsbCustomerDatabase;
import edu.bu.met.cs665.assign4.systems.HttpsConnection;
import edu.bu.met.cs665.assign4.systems.legacy.UsbConnection;
import org.junit.Test;

/**
 * This is the TestAge Class, containing unit tests testing the old legacy interface
 * of accessing the customer data via USB, the new interface of accessing the customer
 * data via HTTPS and the new adapter method to access the USB customer database using
 * the new HTTPS interface.
 */
public class TestAge {

    /**
     * This is the testCustomerUsb method, which will create a new customer, add
     * them into the USB customer database and assert they were added correctly
     * by checking their name to match.
     */
    @Test
    public void testCustomerUsb() {
        Customer customerUsb1 = new Customer("Bob Smith",
            "Bobsmith@bu.edu", "617-888-8881");
        int usbID1 = customerUsb1.getID();
        UsbConnection usb = new UsbConnection();
        usb.addCustomerUsb(customerUsb1);
        assertEquals(usb.getCustomerName(usbID1), "Bob Smith");
    }

    /**
     * This is the testCustomerAdapter method, which will create a new customer, add
     * them into the USB customer database and assert they were added correctly
     * by checking their name to match.
     */
    @Test
    public void testCustomerAdapter() {
        Customer customerAdapter1 = new Customer("John Williams",
            "jwilly@bu.edu", "617-777-8888");
        int adapterID1 = customerAdapter1.getID();
        UsbConnection usb2 = new UsbConnection();
        usb2.addCustomerUsb(customerAdapter1);
        assertEquals(usb2.getCustomerName(adapterID1), "John Williams");
    }


    /**
     * This is the testCustomerHttps method, which will create a new customer, add
     * them into the HTTPS customer database and assert they were added correctly
     * by checking their name to match.
     */
    @Test
    public void testCustomerHttps() {
        Customer customerHttps1 = new Customer("Kate Williams",
            "katewilliams@bu.edu", "617-717-8889");
        int httpsID1 = customerHttps1.getID();
        System.out.println(httpsID1);
        HttpsConnection https = new HttpsConnection();
        https.addCustomerHttps(customerHttps1);
        assertEquals(https.getCustomerName(httpsID1), "Kate Williams");
    }

    /**
     * This is the testAdapterMatchesUsbInfo method, which will create a new customer, add
     * them into the USB customer database and assert that the information is able to
     * be picked out by using the adapter and it matches the information pulled out via
     * the legacy connection.
     */
    @Test
    public void testAdapterMatchesUsbInfo() {
        Customer customerUsb1 = new Customer("Phil Smith",
            "phils@bu.edu", "301-818-8181");
        int usbID2 = customerUsb1.getID();

        UsbConnection usb1 = new UsbConnection();
        UsbCustomerDatabase usbData = new UsbCustomerDatabase();
        UsbToHttpsAdapter usbAdapter = new UsbToHttpsAdapter(usbData);
        usb1.addCustomerUsb(customerUsb1);

        assertEquals(usb1.getCustomerName(usbID2), usbAdapter.getCustomerName(usbID2));
    }

    /**
     * This is the testCustomers method, which will create a new customer and assert
     * their information is correctly matching what is expected/was put in to generate
     * their account.
     */
    @Test
    public void testCustomers() {
        Customer testCustomer = new Customer("John Franco", "jfranco@bu.edu", "860-888-8888");
        assertEquals("John Franco", testCustomer.getName());
        assertEquals("jfranco@bu.edu", testCustomer.getEmailAddress());
        assertEquals("860-888-8888", testCustomer.getPhoneNumber());
    }


}
