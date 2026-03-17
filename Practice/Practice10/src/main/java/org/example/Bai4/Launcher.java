package org.example.Bai4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Máy Tính Cộng");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label lblNum1 = new Label("Số thứ nhất:");
        grid.add(lblNum1, 0, 0);

        TextField txtNum1 = new TextField();
        grid.add(txtNum1, 1, 0);

        Label lblNum2 = new Label("Số thứ hai:");
        grid.add(lblNum2, 0, 1);

        TextField txtNum2 = new TextField();
        grid.add(txtNum2, 1, 1);

        Button btnCalc = new Button("Tính tổng");
        grid.add(btnCalc, 1, 2);

        Label lblResult = new Label("Kết quả: ");
        grid.add(lblResult, 1, 3);

        btnCalc.setOnAction(event -> {
            try {
                double num1 = Double.parseDouble(txtNum1.getText());
                double num2 = Double.parseDouble(txtNum2.getText());

                double sum = num1 + num2;
                lblResult.setText("Kết quả: " + sum);
                lblResult.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");
            } catch (NumberFormatException e) {
                lblResult.setText("Lỗi! Vui lòng nhập số.");
                lblResult.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
            }
        });

        Scene scene = new Scene(grid, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
