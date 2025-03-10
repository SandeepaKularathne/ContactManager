package com.contactmanager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> contacts = FileHandler.readContactsFromFile();

        // Create the JFrame to hold the UI
        JFrame frame = new JFrame("Contact Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        frame.setLayout(new BorderLayout());

        // Create the contact UI panel and add it to the frame
        ContactManager contactUI = new ContactManager(contacts);
        JScrollPane scrollPane = new JScrollPane(contactUI); // Add scrolling if content overflows
        frame.add(scrollPane, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);

    }
}