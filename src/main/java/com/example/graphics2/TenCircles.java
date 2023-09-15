package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class TenCircles extends Application {

    public void start(Stage primaryStage)  {
        Group root=new Group();
        Random r=new Random();
        Circle ring;
        int radius;
        int x;
        int y;
        int maxradius=0;


        for(int count=1; count<=10; count++) {
            radius=r.nextInt(50);
            if(radius>maxradius){
                maxradius=radius;
            }

            x=r.nextInt(500-150)+150;
            y=r.nextInt(500-150)+150;


            ring = new Circle(x, y, radius);

            if(radius==maxradius){
                ring.setFill(Color.rgb(240,14,14,0.3));
            }else {
                ring.setFill(null);
            }
            ring.setStroke(Color.BLACK);
            root.getChildren().add(ring);



        }

        Scene scene=new Scene(root, 650, 650, Color.WHITE);

        primaryStage.setTitle("10 Random Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
}
}
