package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exerciti extends Application {
    public void start(Stage primaryStage) {
        Line linie=new Line(60,100,30,90);
        Rectangle deptungi=new Rectangle(10,10,20, 100);
        Circle cerc=new Circle(50,75, 30);
        Ellipse ellipsa=new Ellipse(150,180, 100, 80);

        Group root=new Group(linie, deptungi, cerc, ellipsa);
        Scene scene= new Scene(root, 500, 350, Color.LIGHTPINK);

        primaryStage.setTitle("3.15");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
