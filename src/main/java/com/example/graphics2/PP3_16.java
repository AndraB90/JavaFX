package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class PP3_16 extends Application {
    public void start(Stage primaryStage){
        Circle c1=new Circle(100, 400, 80);
        c1.setFill(Color.YELLOW);
        Circle c2=new Circle(180, 400, 30);
        c2.setFill(Color.WHITE);
        Circle c3=new Circle(250, 400, 70);
        c3.setFill(Color.VIOLET);
        Circle c4=new Circle(270, 400, 40);
        c4.setFill(Color.RED);
        Circle c5=new Circle(350, 400, 83);
        c5.setFill(Color.GREEN);
        Circle c6=new Circle(450, 400, 70);
        c6.setFill(Color.BLUE);
        Circle c7=new Circle(500, 400, 30);
        c7.setFill(Color.BROWN);
        Circle c8=new Circle(570, 400, 27);
        c8.setFill(Color.PINK);

        Ellipse elip=new Ellipse(350, 400, 350, 40);
        elip.setFill(null);
        elip.setStroke(Color.GREY);

        Group root=new Group(c1, c2, c3, c4, c5, c6, c7, c8, elip);
        Scene scene= new Scene(root, 700, 700, Color.DARKBLUE);

        primaryStage.setTitle("PP3.16");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
