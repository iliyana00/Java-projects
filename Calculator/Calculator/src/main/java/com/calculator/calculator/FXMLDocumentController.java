package com.calculator.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController //implements Initializable
{
    @FXML
    private TextField tfNumber1, tfNumber2, tfResult;
    //private Label label;
    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    private void addButtonAction(ActionEvent event){
        tfResult.setText(getResult('+') + "");
    }
    @FXML
    private void subtractButtonAction(ActionEvent event) {
        tfResult.setText(getResult('-') + "");
    }
    @FXML
    private void multiplyButtonAction(ActionEvent event) {
        tfResult.setText(getResult('*') + "");
    }
    @FXML
    private void divideButtonAction(ActionEvent event) {
        tfResult.setText(getResult('/') + "");
    }
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        //TO DO
//    }
    private double getResult(char op) {
        double number1 = Double.parseDouble(tfNumber1.getText());
        double number2 = Double.parseDouble(tfNumber2.getText());
        switch (op){
            case '+': return number1 + number2;
            case '-': return number1 - number2;
            case '*': return number1 * number2;
            case '/': return number1 / number2;
        }
        return Double.NaN;
    }
}
