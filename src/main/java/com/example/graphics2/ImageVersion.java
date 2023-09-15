package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ImageVersion extends Application {
    public void start(Stage primaryStage){
        Image img=new Image("crin1.jpg");

        ImageView imgview1=new ImageView(img);
        ImageView imgview2=new ImageView(img);
        ImageView imgview3=new ImageView(img);
        ImageView imgview4=new ImageView(img);

        imgview1.setViewport(new Rectangle2D(350, 120, 70,60));
        imgview2.setViewport(new Rectangle2D(300, 100, 70,60));
        imgview3.setViewport(new Rectangle2D(150, 80, 70,60));
        imgview4.setViewport(new Rectangle2D(120, 130, 70,60));


        GridPane gridpane=new GridPane();
        gridpane.setMinSize(400, 200);
        gridpane.setPadding(new Insets(10,10,10,10));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        gridpane.setAlignment(Pos.CENTER);

        gridpane.add(imgview1, 0, 0);
        gridpane.add(imgview2, 1, 0);
        gridpane.add(imgview3, 0, 1);
        gridpane.add(imgview4, 1, 1);

        primaryStage.setTitle("Grid");
        Scene scene= new Scene(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
