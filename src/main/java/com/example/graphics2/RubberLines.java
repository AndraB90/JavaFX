package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;

public class RubberLines extends Application {

    private Line currentLine;
    private Group lines;

    private ColorPicker colorPicker;
    private Text message;

    public void start(Stage primaryStage) {

        message = new Text("Choose a color!");

        colorPicker = new ColorPicker(Color.BLACK);
        colorPicker.setOnAction(this::setColor);
        lines = new Group();

        HBox pickers = new HBox(10, message, colorPicker);
        pickers.setAlignment(Pos.CENTER);

        VBox root = new VBox();
        root.setStyle("-fx-background-color: white");
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pickers, lines);

        Scene scene = new Scene(root, 500, 300, Color.BLACK);

        scene.setOnMousePressed(this::startLine);
        scene.setOnMouseDragged(this::extendLine);

        primaryStage.setTitle("Rubber Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setColor(ActionEvent event) {
        Color c = colorPicker.getValue();
        message.setText("Selected color: " + c.toString());
    }

    private void startLine(MouseEvent event) {
        currentLine = new Line(event.getX(), event.getY(), event.getX(), event.getY());
        currentLine.setStrokeWidth(3);
        currentLine.setStroke(colorPicker.getValue());
        lines.getChildren().add(currentLine);
    }

    private void extendLine(MouseEvent event) {
        currentLine.setEndX(event.getX());
        currentLine.setEndY(event.getY());
    }

}
