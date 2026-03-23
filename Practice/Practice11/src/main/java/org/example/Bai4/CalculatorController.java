package org.example.Bai4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField display;

    private double num1 = 0;
    private String operator = "";
    private boolean startOfNumber = true;

    @FXML
    private void handleNumber(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (startOfNumber) {
            display.setText(value.equals(".") ? "0." : value);
            startOfNumber = false;
        } else {
            if (value.equals(".") && display.getText().contains(".")) {
                return;
            }
            display.setText(display.getText() + value);
        }
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!display.getText().isEmpty()) {
            num1 = Double.parseDouble(display.getText());
            operator = value;
            startOfNumber = true;
        }
    }

    @FXML
    private void handleEqual(ActionEvent event) {
        if (operator.isEmpty() || display.getText().isEmpty()) return;

        double num2 = Double.parseDouble(display.getText());
        double result = 0;

        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/":
                if (num2 == 0) { display.setText("Lỗi"); return; }
                result = num1 / num2;
                break;
        }
        if (result % 1 == 0) {
            display.setText(String.valueOf((long) result));
        } else {
            display.setText(String.valueOf(result));
        }

        operator = "";
        startOfNumber = true;
    }

    @FXML
    private void handleClear(ActionEvent event) {
        display.setText("0");
        num1 = 0;
        operator = "";
        startOfNumber = true;
    }
}