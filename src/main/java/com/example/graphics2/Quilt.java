package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quilt extends Application {
    private static final int SIZE = 6; // Number of squares in each row/column
    private static final int SQUARE_SIZE = 100; // Size of each square in pixels

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quilt");

        // Create two different quilt squares with different colors
        QuiltSquare square1 = new QuiltSquare(Color.rgb(255, 0, 0));
        QuiltSquare square2 = new QuiltSquare(Color.rgb(0, 0, 255));

        // Create a grid pane to hold the quilt squares
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(0);
        grid.setVgap(0);

        // Populate the grid with alternating squares
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Rectangle square = new Rectangle(SQUARE_SIZE, SQUARE_SIZE);
                square.setFill((i + j) % 2 == 0 ? square1.getColor() : square2.getColor());
                grid.add(square, j, i);
            }
        }

        // Create a scene with the grid and display it
        Scene scene = new Scene(grid, SIZE * SQUARE_SIZE, SIZE * SQUARE_SIZE);
        primaryStage.setScene(scene);
        primaryStage.show();
}
}
