package com.example.graphics2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Spinner extends Application {
    private javafx.scene.control.Spinner<String> shapeSpinner;
    private Text text;

    public void start(Stage primaryStage) {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("Square", "Circle", "Rectangle", "Arc");
        shapeSpinner = new javafx.scene.control.Spinner<String>(list);
        shapeSpinner.getStyleClass().add(javafx.scene.control.Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);

        text = new Text();
        text.setFont(new Font("Helvetica", 24));

        VBox pane = new VBox(shapeSpinner, text);
        pane.setStyle("-fx-background-color: skyblue");
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(25);

        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("Spinner Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();

        // add a change listener to the spinner
        shapeSpinner.valueProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                Shape shape = null;
                switch (newValue) {
                    case "Square":
                        shape = new Rectangle(50, 50);
                        break;
                    case "Circle":
                        shape = new Circle(25);
                        break;
                    case "Rectangle":
                        shape = new Rectangle(100, 50);
                        break;
                    case "Arc":
                        shape = new Arc(50, 50, 40, 30, 45, 270);
                        break;
                }
                if (shape != null) {
                    text.setText("Selected shape: " + newValue);
                    pane.getChildren().remove(shape);
                    pane.getChildren().add(shape);
                }
            }
        });
    }
}

