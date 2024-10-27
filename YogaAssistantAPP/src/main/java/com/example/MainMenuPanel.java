package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuPanel extends JPanel {
    private YogaAssistantApp app;

    public MainMenuPanel(YogaAssistantApp app) {
        this.app = app;
        setLayout(new GridLayout(1, 1));

        JButton uploadVideoButton = new JButton("Upload Video");
        uploadVideoButton.addActionListener(e -> app.showUploadVideoPanel());

        add(uploadVideoButton);
    }
}
