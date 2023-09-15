package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class RandomCircles extends Application {

    @Override
    public void start(Stage primaryStage)  {
        Group root=new Group();
        Random r=new Random();
        Circle ring;
        int radius;
        int x;
        int y;


        for(int count=1; count<=100; count++) {
            radius=r.nextInt(150);
            x=r.nextInt(500-150)+150;
            y=r.nextInt(500-150)+150;

            int red = r.nextInt(255);
            int green = r.nextInt(255);
            int blue = r.nextInt(255);

            ring = new Circle(x, y, radius);
            ring.setFill(null);
            ring.setStroke(Color.rgb(red, green,blue));

            root.getChildren().add(ring);



        }

        Scene scene=new Scene(root, 650, 650, Color.CYAN);

        primaryStage.setTitle("Random Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
