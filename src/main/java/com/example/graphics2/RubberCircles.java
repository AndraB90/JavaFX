package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class RubberCircles extends Application {
    private Circle currentCircle;
    private Group root;

    public void start (Stage primaryStage){

        root=new Group();

        Scene scene=new Scene(root, 500, 300, Color.BLACK);

        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("Rubber Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processMousePress(MouseEvent event) {
        Circle circle = new Circle(event.getX(), event.getY(), 0);
        circle.setStroke(Color.CYAN);
        circle.setStrokeWidth(3);
        root.getChildren().add(circle);
    }

    public void processMouseDrag(MouseEvent event) {
        Circle currentCircle = (Circle) root.getChildren().get(root.getChildren().size() - 1);
        double radius = Math.sqrt(Math.pow(event.getX() - currentCircle.getCenterX(), 2) + Math.pow(event.getY() - currentCircle.getCenterY(), 2));
        currentCircle.setRadius(radius);
    }
}
