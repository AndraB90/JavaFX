package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class starField extends Application {
    private static final int NUM_STARS = 1000;
    private static final int MAX_SIZE = 3;
    private static final int MAX_X = 800;
    private static final int MAX_Y = 600;
    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, MAX_X, MAX_Y, Color.BLACK);
        Random rand = new Random();

        for (int i = 0; i < NUM_STARS; i++) {
            double x = rand.nextDouble() * MAX_X;
            double y = rand.nextDouble() * MAX_Y;
            double size = rand.nextDouble() * MAX_SIZE + 1;
            Circle star = new Circle(x, y, size, Color.WHITE);
            root.getChildren().add(star);
        }

        primaryStage.setScene(scene);
        primaryStage.setTitle("Starfield");
        primaryStage.show();
    }


    }

