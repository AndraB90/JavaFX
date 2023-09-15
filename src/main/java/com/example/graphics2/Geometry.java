package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Geometry extends Application {
    public void start(Stage primaryStage){
        Rectangle rect=new Rectangle(100, 100, 80, 50);
        rect.setTranslateX(50);
        rect.setTranslateY(10);
        rect.setRotate(135);
        rect.setScaleX(0.5);
        rect.setScaleY(0.5);


        rect.setStroke(Color.BLACK);
        rect.setFill(Color.GOLD);

        Rectangle square=new Rectangle(50,50, 50,50);

        square.setRotate(120);
        square.setScaleX(2);
        square.setScaleY(2);

         
        square.setStroke(Color.BLACK);
        square.setFill(Color.SILVER);

        Group root=new Group(rect, square);
        Scene scene=new Scene(root, 500, 380, Color.RED);

        primaryStage.setTitle("Geometry");
        primaryStage.setScene(scene);
        primaryStage.show();





    }
}
