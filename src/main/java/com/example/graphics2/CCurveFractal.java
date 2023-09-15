package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class CCurveFractal extends Application {

    private static final int MAX_ORDER = 15;
    private static final double INITIAL_LENGTH = 600.0;
    private static final double INITIAL_ANGLE = -90.0;
    private static final double ROOT_TWO = Math.sqrt(2);

    private Group root;

    public void start(Stage primaryStage) {
        root = new Group();
        Scene scene = new Scene(root, 800, 800, Color.WHITE);
        primaryStage.setTitle("C-Curve Fractal");
        primaryStage.setScene(scene);
        primaryStage.show();

        generateCCurve(100, 700, INITIAL_LENGTH, INITIAL_ANGLE, 0);
    }

    private void generateCCurve(double startX, double startY, double length, double angle, int order) {
        if (order > MAX_ORDER) {
            return;
        }

        double endX = startX + length * Math.cos(Math.toRadians(angle));
        double endY = startY + length * Math.sin(Math.toRadians(angle));

        Line line = new Line(startX, startY, endX, endY);
        root.getChildren().add(line);

        generateCCurve(endX, endY, length / ROOT_TWO, angle + 45, order + 1);
        generateCCurve(endX, endY, length / ROOT_TWO, angle - 45, order + 1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}


