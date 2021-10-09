package com.company1.Day9AddressBook;

public class AddressBook {

    String firstName, lastName, address, city, state, emailId;
    int zipCode;
    long mobileNumber;

    public void printContact() {
        firstName = "Afroj";
        lastName = "Satwilkar";
        address = "Bhadkamba";
        city = "Ratnagiri";
        state = "Maharashtra";
        zipCode = 415801;
        mobileNumber = 9075528330L;
        emailId = "afrozsatvilkar2014@gmail.com";
        System.out.println("Contact Details");
        System.out.print("Name         : "  +firstName + " " +lastName + "\n"
                + "Address      : "  + address + "\n"
                + "City         : "  + city + "\n"
                + "State        : "  + state + "\n"
                + "ZipCode      : "  + zipCode + "\n"
                + "MobileNumber : "  + mobileNumber + "\n"
                + "EmailId      : "  + emailId + "\n" );
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.printContact();
    }
}