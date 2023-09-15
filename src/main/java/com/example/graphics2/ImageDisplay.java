package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ImageDisplay extends Application {
    public void start(Stage primaryStage){
        Image img=new Image("seagull1.jpg");
        /*Image logo=new Image("seegull1.jpg");

         */
        ImageView imgView= new ImageView(img);
        imgView.setViewport(new Rectangle2D(350, 120, 70,60));

        StackPane pane=new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");
        Scene scene= new Scene(pane, 1000, 500);




        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
