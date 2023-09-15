package com.example.graphics2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextSlider extends Application {
    private Text text;
    private Slider slider;

    public void start (Stage primaryStage){
        text=new Text("Hello");

        slider=new Slider(0,200,150);
        slider.setShowTickMarks(true);
        slider.setPadding(new Insets(0,20,20,80));

        slider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(
                    ObservableValue<? extends Number> observableValue,
                    Number oldValue,
                    Number newValue) {
                text.setFont(new Font(newValue.doubleValue()));
            }
        });

        BorderPane pane=new BorderPane();
        pane.setBottom(slider);
        pane.setCenter(text);
        pane.setStyle("-fx-background-color: grey");

        Scene scene=new Scene(pane, 500, 300);

        primaryStage.setTitle("Text Sliders");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

