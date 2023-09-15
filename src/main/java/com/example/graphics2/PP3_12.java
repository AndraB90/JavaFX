package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PP3_12 extends Application {
    public void start(Stage primaryStage){
        Rectangle build1=new Rectangle(10, 90, 250, 300);
        build1.setFill(Color.WHITE);
        Rectangle build2=new Rectangle(200, 100, 100, 200);
        build2.setFill(Color.WHITE);
        Rectangle build3=new Rectangle(250, 150, 100, 200);
        build3.setFill(Color.WHITE);
        Rectangle build4=new Rectangle(300, 180, 100, 200);
        build4.setFill(Color.WHITE);

        Circle moon=new Circle(300, 80, 30);
        moon.setFill(Color.YELLOW);
        moon.setTranslateX(100);

        Group root= new Group(build1, build2, build3, build4,moon);
        Scene scene= new Scene(root, 500, 500, Color.DARKBLUE);

        primaryStage.setTitle("PP3.12");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
