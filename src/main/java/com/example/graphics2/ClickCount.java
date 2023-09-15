package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClickCount extends Application {

    private Button button;
    private Text countText;
    private int count;

    public void start (Stage primaryStage){
        count=0;
        countText=new Text("Pushes 0");
        button=new Button("Click me!");
        button.setLayoutX(100);
        button.setLayoutY(80);
        button.setOnMouseClicked(this::processMouseClick);
        FlowPane pane = new FlowPane(button, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: violet");


        Scene scene=new Scene(pane, 400, 300);
        scene.setOnMouseClicked(this::processMouseClick);




        primaryStage.setTitle("Click Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processMouseClick(MouseEvent event){
        count++;
        countText.setText("Count : "+count);
    }
}
