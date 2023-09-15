package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IncrementDecrement extends Application {
    private int countIncrement;
    private Text countTextIncrement;
    private int countDecrement;
    private Text countTextDecrement;
    public void start(Stage primaryStage){
        countIncrement = 50;
        countTextIncrement = new Text("Pushes: 50");
        countDecrement = 50;
        countTextDecrement = new Text("Pushes: 50");

        Button pushinc = new Button("Push Me for more!");
        pushinc.setOnAction(this::processButtonPress);
        Button pushdec = new Button("Push Me for less!");
        pushdec.setOnAction(this::processButtonPressDec);


        FlowPane pane = new FlowPane(pushinc, countTextIncrement, pushdec, countTextDecrement);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: cyan");



        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processButtonPress(ActionEvent event) {
        countIncrement++;
        countTextIncrement.setText("Pushes: " + countIncrement);

    }

    public void processButtonPressDec(ActionEvent event) {
        countDecrement--;
        countTextDecrement.setText("Pushes: " + countDecrement);

    }



}
