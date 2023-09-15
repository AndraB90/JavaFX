package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RugPattern extends Application {

    private final int ROWS = 5;
    private final int COLS = 5;
    private final int STAR_SIZE = 50;
    private final int SPACE_SIZE = 10;

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(SPACE_SIZE));
        pane.setHgap(SPACE_SIZE);
        pane.setVgap(SPACE_SIZE);
        pane.setStyle("-fx-background-color: gray");

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {

                StackPane star = new StackPane();
                Rectangle rect1 = new Rectangle(STAR_SIZE, STAR_SIZE, Color.WHITE);
                Rectangle rect2 = new Rectangle(STAR_SIZE, STAR_SIZE, Color.BLACK);
                rect2.setRotate(45);
                star.getChildren().addAll(rect1, rect2);

                pane.add(star, col, row);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rug Pattern");
        primaryStage.show();
    }
}
