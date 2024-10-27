package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationPanel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private YogaAssistantApp app;

    public RegistrationPanel(YogaAssistantApp app) {
        this.app = app;
        setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> app.showMainMenu());

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> app.showLoginScreen());

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);
        add(backButton);
    }
}
