package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpenskiTriangle extends Application {

    private static final int MAX_ORDER = 8;
    private static final double WIDTH = 800;
    private static final double HEIGHT = 800;

    private Group root;

    public void start(Stage primaryStage) {
        root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);
        primaryStage.setTitle("Sierpinski Triangle");
        primaryStage.setScene(scene);
        primaryStage.show();

        drawSierpinskiTriangle(MAX_ORDER, WIDTH / 2, 50, WIDTH);
    }

    private void drawSierpinskiTriangle(int order, double centerX, double topY, double sideLength) {
        if (order == 0) {
            drawTriangle(centerX, topY, sideLength);
        } else {
            double halfSideLength = sideLength / 2;

            drawSierpinskiTriangle(order - 1, centerX, topY, halfSideLength);
            drawSierpinskiTriangle(order - 1, centerX - halfSideLength, topY + halfSideLength, halfSideLength);
            drawSierpinskiTriangle(order - 1, centerX + halfSideLength, topY + halfSideLength, halfSideLength);
        }
    }

    private void drawTriangle(double centerX, double topY, double sideLength) {
        double height = sideLength * Math.sqrt(3) / 2;

        Polygon triangle = new Polygon(
                centerX, topY,
                centerX - sideLength / 2, topY + height,
                centerX + sideLength / 2, topY + height
        );

        triangle.setFill(Color.TRANSPARENT);
        triangle.setStroke(Color.BLACK);

        root.getChildren().add(triangle);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

