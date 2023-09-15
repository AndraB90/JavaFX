package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class AlienSpaceShips extends Application {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int SHIP_SIZE_1 = 50;
    private final int SHIP_SIZE_2 = 70;
    private final int SHIP_SIZE_3 = 90;

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        // Create the spaceships
        Spaceship spaceship1 = new Spaceship(SHIP_SIZE_1);
        Spaceship spaceship2 = new Spaceship(SHIP_SIZE_2);
        Spaceship spaceship3 = new Spaceship(SHIP_SIZE_3);
        Spaceship spaceship4 = new Spaceship(SHIP_SIZE_2);

        // Set the positions of the spaceships
        spaceship1.setLayoutX(150);
        spaceship1.setLayoutY(100);
        spaceship2.setLayoutX(400);
        spaceship2.setLayoutY(250);
        spaceship3.setLayoutX(650);
        spaceship3.setLayoutY(400);
        spaceship4.setLayoutX(300);
        spaceship4.setLayoutY(500);

        // Create the field of stars
        Random rand = new Random();
        for (int i = 0; i < 200; i++) {
            Circle star = new Circle(rand.nextInt(WIDTH), rand.nextInt(HEIGHT), 1, Color.WHITE);
            pane.getChildren().add(star);
        }

        // Add the spaceships to the pane
        pane.getChildren().addAll(spaceship1, spaceship2, spaceship3, spaceship4);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("Alien Spaceships");
        primaryStage.setScene(scene);
        primaryStage.show();
}
}
