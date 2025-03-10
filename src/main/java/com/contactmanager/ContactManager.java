package com.contactmanager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ContactManager extends JPanel {

    public ContactManager(List<Contact> contacts) {
        // Setting up the layout of the panel
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Loop through the list of contacts and display them
        for (Contact contact : contacts) {
            JPanel contactPanel = createContactPanel(contact);
            add(contactPanel);
        }
    }

    private JPanel createContactPanel(Contact contact) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        // Left-side: User Icon (you can replace this with an actual image)
        ImageIcon userIcon = new ImageIcon("src/main/resources/images/user_icon.png");// Make sure the image exists
        ImageIcon resizedIcon = new ImageIcon(userIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JLabel lblIcon = new JLabel(resizedIcon);
        panel.add(lblIcon);

        // Middle: Name
        JLabel lblname = new JLabel(contact.getName());
        lblname.setFont(new Font("Arial", Font.PLAIN, 24));
        panel.add(lblname);

        // Right side: Phone Number and Email
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        JLabel lblMobile = new JLabel(contact.getMobile());
        JLabel lblEmail = new JLabel(contact.getEmail());

        lblMobile.setFont(new Font("Arial", Font.PLAIN, 14));
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 10));

        rightPanel.add(lblMobile);
        rightPanel.add(lblEmail);

        panel.add(rightPanel);

        return panel;
    }
}
