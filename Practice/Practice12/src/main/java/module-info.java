module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires Java.WebSocket;


    opens org.example.Bai2 to javafx.fxml;
    exports org.example.Bai2;
}