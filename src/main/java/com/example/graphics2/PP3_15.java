package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class PP3_15 extends Application {
    public void start(Stage primaryStage){
        Rectangle rect=new Rectangle(100, 150, 200, 100);
        Random r=new Random();
        int color1=r.nextInt(256);
        int color2=r.nextInt(256);
        int color3=r.nextInt(256);
        rect.setFill(Color.rgb(color1,color2, color3));

        Group root=new Group(rect);
        Scene scene=new Scene(root, 500, 500, Color.BLACK);

        primaryStage.setTitle("PP3.15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
