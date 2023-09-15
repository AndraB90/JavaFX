package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormValidator extends Application {
    public void start(Stage primaryStage){
        Scene scene=new Scene(new Form(), 800, 800);

        primaryStage.setTitle("Form Converter");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
