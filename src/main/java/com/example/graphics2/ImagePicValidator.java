package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImagePicValidator extends Application {
    public void start(Stage primaryStage){
        Imagepic pane=new Imagepic();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color:orange");

        Scene scene= new Scene(pane, 800, 800);
        primaryStage.setTitle("Color Options");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
