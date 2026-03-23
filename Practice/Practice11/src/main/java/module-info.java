module org.example.practice11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example to javafx.fxml;
    exports org.example.Bai3;
    exports org.example.Bai4;
    opens org.example.Bai4 to javafx.fxml;
}