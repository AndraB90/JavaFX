package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Random;

public class ParallelLines extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root=new Group();
        Color LineColor=Color.BLACK;
        Line line=null;

        Random r=new Random();
        int length;

        for(int count=1; count<=20; count++){
            line=new Line();
            line.setFill(LineColor);
            root.getChildren().add(line);
            length=r.nextInt(100-15)+15;
            line.setStartX(100+length);
            line.setStartY(100+length);
            line.setEndX(300+length);
            line.setEndY(100+length);




        }

        Scene scene=new Scene(root, 500, 500, Color.CYAN);

        primaryStage.setTitle("Parallel Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
