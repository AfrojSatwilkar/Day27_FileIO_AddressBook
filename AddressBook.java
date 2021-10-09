package com.company1.Day9AddressBook;
import java.util.Scanner;

public class AddressBook {
    static ContactDetails person = new ContactDetails();
    public static void addNewContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();
        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        printContact();
    }

    public static void printContact() {
        System.out.println("Contact Details");
        System.out.println("Name         : " + person.getFirstName() + " " + person.getLastName() + "\n"
                + "Address      : " + person.getAddress()   + "\n"
                + "City         : " + person.getCity()      + "\n"
                + "State        : " + person.getState()     + "\n"
                + "ZipCode      : " + person.getZipCode()   + "\n"
                + "MobileNumber : " + person.getMobileNumber()  + "\n"
                + "EmailId      : " + person.getEmailId()   + "\n");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        addNewContact();


    }
}