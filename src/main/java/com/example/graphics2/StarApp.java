package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StarApp extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();

        Star star1 = new Star(100, 100, 50, Color.RED);
        Star star2 = new Star(200, 150, 75, Color.GREEN);
        Star star3 = new Star(300, 100, 100, Color.BLUE);
        Star star4 = new Star(400, 150, 125, Color.YELLOW);
        Star star5 = new Star(500, 100, 150, Color.PURPLE);

        root.getChildren().addAll(star1, star2, star3, star4, star5);

        Scene scene = new Scene(root, 600, 200);
        primaryStage.setTitle("Star App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
