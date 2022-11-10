module com.example.helloapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helloapplication to javafx.fxml;
    exports com.example.helloapplication;
}