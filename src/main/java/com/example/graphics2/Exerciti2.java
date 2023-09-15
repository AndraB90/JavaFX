package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exerciti2 extends Application {
    public void start (Stage primaryStage){
        Line linie1=new Line(20, 20, 80, 20);
        Line linie2=new Line(20, 80, 80, 80);
        Line linie3=new Line(80, 80, 80, 20);
        Line linie4=new Line(80, 20, 80, 80);

        Group root= new Group(linie1, linie2, linie3, linie4);
        Scene scene= new Scene(root, 500, 350, Color.YELLOW);

        primaryStage.setTitle("3.16");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
