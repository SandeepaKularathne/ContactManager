package com.contactmanager;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> contacts = FileHandler.readContactsFromFile();

        for (Contact contact : contacts){

            System.out.println("Name : "+contact.getName());
            System.out.println("Mobile : "+contact.getMobile());
            System.out.println("Email : "+contact.getEmail());
            System.out.println("---------------------------------");

        }
    }
}