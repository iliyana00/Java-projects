package com.example.helloapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label height=new Label("H");
        Label weight = new Label("W");
        Label result = new Label("BMI");
        TextField tf1=new TextField();
        tf1.setStyle("-fx-background-color: #ed8ce5; ");
        tf1.setStyle("-fx-border-color: #000000; ");
        height.setAlignment(Pos.CENTER);


        TextField tf2=new TextField();
        tf1.setText("0");
        tf2.setText("0");
        TextField tf3=new TextField();
        Button b = new Button("Calculate BMI");
        GridPane grid = new GridPane();
        grid.addRow(0, height, tf1);
        grid.addRow(1, weight, tf2);
        grid.addRow(2, result, tf3);
        grid.addRow(3, b);
        Scene scene=new Scene(grid,600,400);
        ImageView us = new ImageView(new Image("giphy.gif"));
        grid.add(us, 1, 5);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();


        b.setOnAction(e -> {
            String height1 = tf1.getText();
            String weight1 = tf2.getText();

            com.example.helloapplication.bmi bmi = new bmi("Didka", 22, Integer.parseInt(weight1),Integer.parseInt(height1) );
            tf3.setText("" + bmi.getBMI());

        });
    }

    public static void main(String[] args) {
        launch();
    }
}
