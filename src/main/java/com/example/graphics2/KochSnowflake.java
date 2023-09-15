package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KochSnowflake extends Application {
    private final static int MIN_ORDER=1;
    private final static int MAX_ORDER=6;

    private int order;
    private Button up, down;
    private Text orderText;
    private KochPane fractalPane;

    public void start(Stage primaryStage){
        Image upImage=new Image("ciresi1.jpg");
        up=new Button();
        up.setGraphic(new ImageView(upImage));
        up.setOnAction(this:: processUpButtonPress);

        Image downImage=new Image("crin1.jpg");
        down=new Button();
        down.setGraphic(new ImageView(downImage));
        down.setOnAction(this::processDownButtonPress);
        down.setDisable(true);

        order=1;
        orderText=new Text("Order: 1");

        HBox toolbar=new HBox();
        toolbar.setStyle("-fx-background-color: darksalmon");
        toolbar.setAlignment(Pos.CENTER);
        toolbar.setPrefHeight(50);
        toolbar.setSpacing(40);
        toolbar.getChildren().addAll(up, orderText,down);

        fractalPane=new KochPane();
        VBox root=new VBox();
        root.setStyle("-fx-background-color: white");
        root.getChildren().addAll(toolbar, fractalPane);

        Scene scene=new Scene(root, 400, 450);

        primaryStage.setTitle("Koch Snowflake");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processUpButtonPress(ActionEvent event){
        order++;
        orderText.setText("Order: "+order);
        fractalPane.makeFractal(order);

        down.setDisable(false);
        if(order == MAX_ORDER)
            up.setDisable(true);
    }

    public void processDownButtonPress(ActionEvent event){
        order--;
        orderText.setText("Order: "+ order);
        fractalPane.makeFractal(order);

        up.setDisable(false);
        if(order == MIN_ORDER)
            down.setDisable(true);
    }
}
