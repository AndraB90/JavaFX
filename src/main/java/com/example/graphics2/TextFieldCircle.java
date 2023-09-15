package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class TextFieldCircle extends Application {
    private static final double MAX_X = 600;
    private static final double MAX_Y = 300;

    private TextField radiusValue;


    @Override
    public void start(Stage stage){
        Circle circle = new Circle(MAX_X / 2, MAX_Y / 2, 30);

        Text radiusValueText = new Text("Type the size of radius: ");

        Font font= new Font(9);

        TextField radiusValue=new TextField();
        radiusValue.setTranslateX(115);
        radiusValue.setTranslateY(140);
        radiusValue.setFont(font);

        radiusValue.setOnAction((event) -> {

            circle.setRadius(Integer.parseInt(radiusValue.getText( )));

        });

        Group layout = new Group(
                circle,
                new FlowPane(circle,radiusValueText, radiusValue)
        );

        stage.setScene(new Scene(layout, MAX_X, MAX_Y, Color.CYAN));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

