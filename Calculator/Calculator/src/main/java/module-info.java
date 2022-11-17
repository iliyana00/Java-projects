module com.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.calculator.calculator to javafx.fxml;
    exports com.calculator.calculator;
}