package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseSliders extends Application {
    private Ellipse ellipse;
    /*private Circle circle;

     */
    private Slider xSlider, ySlider;

    public void start (Stage primaryStage){
        ellipse=new Ellipse(250, 150, 150, 75);
        ellipse.setFill(Color.SALMON);

        /*circle=new Circle(250, 150, 75);
        circle.radiusProperty().bind(xSlider.valueProperty());

         */

        xSlider=new Slider(0,200,150);
        xSlider.setShowTickMarks(true);
        xSlider.setPadding(new Insets(0,20,20,80));

        ellipse.radiusXProperty().bind(xSlider.valueProperty());

        ySlider=new Slider(0,100,75);
        ySlider.setOrientation(Orientation.VERTICAL);
        ySlider.setShowTickMarks(true);
        ySlider.setPadding(new Insets(20,0,0,30));

        ellipse.radiusYProperty().bind(ySlider.valueProperty());

        BorderPane pane=new BorderPane();
        pane.setLeft(ySlider);
        pane.setBottom(xSlider);
        pane.setCenter(ellipse);
        pane.setStyle("-fx-background-color: grey");

        Scene scene=new Scene(pane, 500, 300);

        primaryStage.setTitle("Ellipse Sliders");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
