package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class ConcentricCircles extends Application {
    @Override
    public void start(Stage primaryStage)  {


    Group root=new Group();
    Random r=new Random();
    Circle ring;
    int radius=50;

        for(int count=1; count<=10; count++) {
            radius=r.nextInt(150);
            ring = new Circle(250, 250, radius);
            ring.setFill(null);
            ring.setStroke(Color.BLACK);
            root.getChildren().add(ring);



        }

    Scene scene=new Scene(root, 500, 500, Color.CYAN);

        primaryStage.setTitle("Concentric Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
}
}


