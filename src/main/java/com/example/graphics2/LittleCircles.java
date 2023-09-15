package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class LittleCircles extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();
        Random r = new Random();
        Circle ring;
        int radius = 1;
        int x;
        int y;


        for (int count = 1; count <= 10000; count++) {
            x = r.nextInt(500 - 150) + 150;
            y = r.nextInt(500 - 150) + 150;


            ring = new Circle(x, y, radius);

            if (ring.getCenterX() < 325)
                ring.setFill(Color.RED);
            else
                ring.setFill(Color.GREEN);


            root.getChildren().add(ring);


        }

        Scene scene = new Scene(root, 650, 650, Color.BLACK);

        primaryStage.setTitle("Little Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
