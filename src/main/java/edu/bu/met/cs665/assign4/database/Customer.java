/**
 * Name: Jacob Kustra
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/7/2023
 * File Name: Customer.java
 * Description: The Customer.java class which contains the variables and
 * methods needed to create a customer that gets placed into the databases.
 */


package edu.bu.met.cs665.assign4.database;

import java.util.Random;

/**
 * This is the Customer class which is used to generate a new customer to put
 * into the database.
 */
public class Customer {
  public int customerID;
  public String name;
  public String emailAddress;
  public String phoneNumber;

  /**
   * The generateID method randomly generates a 4-digit ID for the customer to
   * have associated with their account.
   */
  public void generateID() {
    int upperLimit = 9999;
    int lowerLimit = 1000;
    Random randomInt = new Random();
    int randomID = randomInt.nextInt(upperLimit - lowerLimit) + lowerLimit;
    this.customerID = randomID;
  }

  /**
   * The getID method returns the customerID associated with the customer.
   */
  public int getID() {
    return this.customerID;
  }

  /**
   * The getName method returns the customer's name associated with the account.
   */
  public String getName() {
    return this.name;
  }

  /**
   * The getEmailAddress method returns the customer's email associated with the account.
   */
  public String getEmailAddress() {
    return this.emailAddress;
  }

  /**
   * The getPhoneNumber method returns the customer's phone number associated with the account.
   */
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * The Customer constructor method takes the string inputs for the customer's name,
   * email address, and phone number and setting those strings to their account details
   * while also generating them a random ID using the generateID method.
   */
  public Customer(String name, String emailAddress, String phoneNumber) {
    generateID();
    this.name = name;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;
  }

}
