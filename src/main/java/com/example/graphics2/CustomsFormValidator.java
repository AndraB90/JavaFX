package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CustomsFormValidator extends Application {
    public void start(Stage primaryStage){
        CustomsForm pane = new CustomsForm();
        pane.setAlignment(Pos.CENTER); pane.setStyle("-fx-background-color: skyblue");
        Scene scene = new Scene(pane, 750, 700);
        primaryStage.setTitle("Item Options");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

