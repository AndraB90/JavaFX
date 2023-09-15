package com.example.graphics2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Quoteoptions extends Application {
    public void start(Stage primaryStage){
        /*QuoteoptionsPane pane=new QuoteoptionsPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color:lightgreen");

        Scene scene= new Scene(pane, 500, 150);
        primaryStage.setTitle("Quote Options");
        primaryStage.setScene(scene);
        primaryStage.show();

         */
        primaryStage.setTitle("Creating ChoiceBox for Quotes");

        // create a button
        Button b = new Button("show");

        // create a tile pane
        TilePane r = new TilePane();

        // create a label
        Label l = new Label("Choose your favorie quote");

        // string array
        String st[] = { "I think, therefore I am.", "Measure twice. Cut once.", "Take my wife, please", "Never say never", "I have my own" };

        // create a choiceBox
        ChoiceBox c = new ChoiceBox(FXCollections.observableArrayList(st));

        // add ChoiceBox
        r.getChildren().add(l);
        r.getChildren().add(c);

        // create a scene
        Scene sc = new Scene(r, 200, 200);

        // set the scene
        primaryStage.setScene(sc);

        primaryStage.show();
    }

}

