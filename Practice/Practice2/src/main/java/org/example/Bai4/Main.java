package org.example.Bai4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chuyển đổi nhiệt độ");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblInput = new JLabel("Nhập độ C:");
        lblInput.setBounds(20, 20, 100, 25);
        frame.add(lblInput);

        JTextField txtCelsius = new JTextField();
        txtCelsius.setBounds(120, 20, 150, 25);
        frame.add(txtCelsius);

        JLabel lblResult = new JLabel("Kết quả độ F: ");
        lblResult.setBounds(20, 100, 250, 25);
        frame.add(lblResult);

        JButton btnConvert = new JButton("Chuyển đổi");
        btnConvert.setBounds(120, 60, 120, 25);
        frame.add(btnConvert);

        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double c = Double.parseDouble(txtCelsius.getText());
                    double f = (c * 9 / 5) + 32;
                    lblResult.setText("Kết quả độ F: " + String.format("%.2f", f));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập một số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}