package com.contactmanager;

import java.io.*;
import java.util.*;
public class FileHandler {

    // Method to read contacts from the file and return a list of Contact objects
    public static List<Contact> readContactsFromFile(String filePath) {
        List<Contact> contacts = new ArrayList<>();
        BufferedReader reader = null;


        try {
            // Create a BufferedReader to read the file
            reader = new BufferedReader(new FileReader("src/main/resources/data/contacts.txt"));
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split each line by commas to extract contact details
                String[] contactDetails = line.split(",");

                if (contactDetails.length == 3) {
                    // Create a new Contact object with the parsed details
                    String name = contactDetails[0].trim();
                    String phoneNumber = contactDetails[1].trim();
                    String email = contactDetails[2].trim();

                    // Add the contact to the list
                    contacts.add(new Contact(name, phoneNumber, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the reader to avoid resource leaks
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return contacts;
    }
}
