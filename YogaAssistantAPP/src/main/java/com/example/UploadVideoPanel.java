package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class UploadVideoPanel extends JPanel {
    private YogaAssistantApp app;
    private JButton uploadButton;
    private JTextField filePathField;

    public UploadVideoPanel(YogaAssistantApp app) {
        this.app = app;
        setLayout(new GridLayout(3, 1));

        filePathField = new JTextField();
        uploadButton = new JButton("Upload Video");

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    filePathField.setText(selectedFile.getAbsolutePath());
                    uploadVideo(selectedFile);
                }
            }
        });

        add(new JLabel("Select a video file to upload:"));
        add(filePathField);
        add(uploadButton);
    }

    private void uploadVideo(File videoFile) {
        File uploadDir = new File("uploads");
        if (!uploadDir.exists()) {
            uploadDir.mkdir(); // Create the uploads directory if it doesn't exist
        }
        try {
            // Copy the video file to the uploads directory
            Files.copy(videoFile.toPath(), new File(uploadDir, videoFile.getName()).toPath());
            JOptionPane.showMessageDialog(this, "Video uploaded successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error uploading video: " + e.getMessage());
        }
    }
}
