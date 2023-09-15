package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImagePane extends Application {
    public void start (Stage primaryStage){
        Image img1=new Image("bujori2.jpg");
        Image img2=new Image("ciresi2.jpg");
        Image img3=new Image("Trandafiri2.jpg");

        ImageView imgView1= new ImageView(img1);
        ImageView imgView2= new ImageView(img2);
        ImageView imgView3= new ImageView(img3);

        FlowPane pane=new FlowPane(imgView1, imgView2, imgView3);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: blue");

        Scene scene=new Scene(pane, 800,800);
        primaryStage.setTitle("FLori");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
