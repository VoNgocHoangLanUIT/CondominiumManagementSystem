/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ImageChooserExample extends JFrame {
    private JLabel imageLabel;

    public ImageChooserExample() {
        setTitle("Thêm hình ảnh");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Nút thêm ảnh
        JButton chooseButton = new JButton("Thêm ảnh");
        add(chooseButton, BorderLayout.SOUTH);

        // Label để hiển thị hình
        imageLabel = new JLabel("Chưa có ảnh", JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Xử lý khi nhấn nút
        chooseButton.addActionListener(e -> chooseImage());

        setVisible(true);
    }

    private void chooseImage() {
        JFileChooser fileChooser = new JFileChooser();
        // Lọc chỉ cho chọn file hình ảnh
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image files", "jpg", "jpeg", "png", "gif"
        ));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

            // Tùy chỉnh kích thước ảnh nếu cần
            Image scaledImage = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
            imageLabel.setText(""); // Xóa chữ nếu có
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageChooserExample::new);
    }
}

