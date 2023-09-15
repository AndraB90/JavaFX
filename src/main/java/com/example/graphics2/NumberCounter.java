package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class NumberCounter extends Application {

    private Text countText;

    public void start(Stage primaryStage){

        countText=new Text("Push the button");
        Button push= new Button("Push me!");
        push.setOnAction(this::processButtonPress);
        FlowPane pane = new FlowPane(push, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: cyan");

        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("NumberCounter");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processButtonPress(ActionEvent event) {
        Random number= new Random();
        int randomness= number.nextInt(101)+1;
        countText.setText("Your magic number is: " + randomness);

    }
}
