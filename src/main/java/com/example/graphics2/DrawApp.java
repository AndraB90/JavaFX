package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawApp extends Application {
    private Polyline currentLine;
    private Color currentColor = Color.BLACK;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        // Create a button to clear the scene
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clear());

        // Create a color picker to choose the current drawing color
        ColorPicker colorPicker = new ColorPicker(currentColor);
        colorPicker.setOnAction(e -> currentColor = colorPicker.getValue());

        // Put the button and color picker in an HBox at the top
        HBox topBox = new HBox(10, clearButton, colorPicker);
        topBox.setAlignment(Pos.CENTER_LEFT);
        root.setTop(topBox);

        // Create a new polyline each time the mouse is pressed
        root.setOnMousePressed(e -> {
            currentLine = new Polyline(e.getX(), e.getY());
            currentLine.setStroke(currentColor);
            currentLine.setStrokeWidth(3);
            root.getChildren().add(currentLine);
        });

        // Add points to the current polyline as the mouse is dragged
        root.setOnMouseDragged(e -> currentLine.getPoints().addAll(e.getX(), e.getY()));

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Draw App");
        primaryStage.show();
    }

    private void clear() {
        // Remove all polylines from the root pane
        root.getChildren().removeIf(node -> node instanceof Polyline);
    }

}
