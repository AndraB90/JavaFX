package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class PP3_13 extends Application {
    public void start (Stage primaryStage){
        Random r=new Random();
        int x=r.nextInt(150-50+1)+50;

        Circle c=new Circle(200,200,x);
        c.setFill(Color.DARKVIOLET);

        Group root= new Group(c);
        Scene scene=new Scene(root, 500, 500, Color.ORANGE);

        primaryStage.setTitle("PP3.13");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
