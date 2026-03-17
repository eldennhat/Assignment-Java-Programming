module org.example {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.Bai4 to javafx.fxml;
    exports org.example.Bai4;

}