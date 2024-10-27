package com.example;

import javax.swing.*;
import java.awt.*;

public class YogaAssistantApp {
    private JFrame frame;

    public YogaAssistantApp() {
        frame = new JFrame("Yoga Assistant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        showLoginScreen();
        frame.setVisible(true);
    }

    public void showLoginScreen() {
        frame.getContentPane().removeAll();
        frame.add(new LoginPanel(this));
        frame.revalidate();
        frame.repaint();
    }

    public void showRegistrationScreen() {
        frame.getContentPane().removeAll();
        frame.add(new RegistrationPanel(this));
        frame.revalidate();
        frame.repaint();
    }

    public void showMainMenu() {
        frame.getContentPane().removeAll();
        frame.add(new MainMenuPanel(this));
        frame.revalidate();
        frame.repaint();
    }

    public void showUploadVideoPanel() {
        frame.getContentPane().removeAll();
        frame.add(new UploadVideoPanel(this));
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(YogaAssistantApp::new);
    }
}
