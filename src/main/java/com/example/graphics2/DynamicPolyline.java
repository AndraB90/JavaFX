package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.ArrayList;


public class DynamicPolyline extends Application {

    private ArrayList<Double> points = new ArrayList<>();
    private Polyline polyline = new Polyline();

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400);

        // create button to clear window and start over
        Button clearButton = new Button("Clear");
        clearButton.setLayoutX(10);
        clearButton.setLayoutY(10);
        clearButton.setOnAction(event -> {
            root.getChildren().clear();
            polyline.getPoints().clear();
            points.clear();
        });
        root.getChildren().add(clearButton);

        // handle mouse clicks
        scene.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) { // end polyline on double click
                if (!points.isEmpty()) {
                    polyline.getPoints().addAll(points);
                    root.getChildren().add(polyline);
                    points.clear();
                    polyline = new Polyline();
                }
            } else { // add new line segment to polyline
                points.add(event.getX());
                points.add(event.getY());
                polyline.getPoints().addAll(points);
                points.remove(points.size() - 1);
                points.remove(points.size() - 1);
            }
        });

        root.getChildren().add(polyline);

        primaryStage.setTitle("Dynamic Polyline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
