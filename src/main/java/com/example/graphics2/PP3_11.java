package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PP3_11 extends Application {
    public void start (Stage primaryStage){
        Circle circle1=new Circle(80,70,30);
        circle1.setFill(Color.RED);
        Circle circle2=new Circle(120,200,30);
        circle2.setFill(Color.WHITE);
        Circle circle3=new Circle(300,150,30);
        circle3.setFill(Color.RED);

        Circle circle4=new Circle(350,400,30);
        circle4.setFill(Color.WHITE);
        Circle circle5=new Circle(280,360,30);
        circle5.setFill(Color.RED);

        Group root= new Group(circle1,circle2, circle3, circle4, circle5);
        Scene scene= new Scene(root, 500, 500, Color.DARKGREEN);

        primaryStage.setTitle("PP3.11");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
