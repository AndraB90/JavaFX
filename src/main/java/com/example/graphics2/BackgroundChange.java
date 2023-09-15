package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BackgroundChange extends Application {
    private StackPane root;

    public void start (Stage primaryStage){

        root=new StackPane();
        root.setStyle("-fx-background-color: black;");
        Scene scene=new Scene(root, 500, 300);
        scene.setOnMouseEntered(this::processMouseEnter);



        primaryStage.setTitle("Mouse Background Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processMouseEnter(MouseEvent event){
        if(event.getX()<=250){
            root.setStyle("-fx-background-color: red;");
        }else{
            root.setStyle("-fx-background-color: green;");
        }
    }
}
