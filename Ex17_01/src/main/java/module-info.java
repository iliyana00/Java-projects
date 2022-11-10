module com.example.ex17_01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.ex17_01 to javafx.fxml;
    exports com.example.ex17_01;
}