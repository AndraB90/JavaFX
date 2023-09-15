package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Colorpick extends Application {
    public void start(Stage primaryStage){
        ColorpickPane pane=new ColorpickPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color:lightgreen");

        Scene scene= new Scene(pane, 500, 150);
        primaryStage.setTitle("Color Options");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
