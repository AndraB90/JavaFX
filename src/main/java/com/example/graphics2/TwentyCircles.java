package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class TwentyCircles extends Application{

        @Override
        public void start(Stage primaryStage)  {
            Group root=new Group();
            Random r=new Random();
            Circle ring;
            int radius;
            int x;
            int y;
            Circle[] circles=new Circle[20];

            for(int count=0; count<20; count++) {
                radius=r.nextInt(150);
                x=r.nextInt(500-150)+150;
                y=r.nextInt(500-150)+150;
                ring=new Circle(x,y,radius);
                boolean overlapping = false;
                for(int i = 0; i < count; i++) {
                    Circle c = circles[i];
                    double distance = Math.sqrt(Math.pow(c.getCenterX() - x, 2) + Math.pow(c.getCenterY() - y, 2));
                    if(distance < c.getRadius() + radius) {
                        overlapping = true;
                        break;
                    }
                }
                if(overlapping) {
                    ring.setFill(Color.rgb(0, 0, 255, 0.3));
                } else {
                    ring.setFill(Color.BLACK);
                }
                circles[count] = ring;
                root.getChildren().add(ring);
            }


            Scene scene=new Scene(root, 650, 650, Color.CYAN);

            primaryStage.setTitle("Twenty Circles");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
}
