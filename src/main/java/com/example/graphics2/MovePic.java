package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MovePic extends Application {
    @Override
    public void start(Stage primaryStage)  {


    Image img1=new Image("flower.png");


    ImageView imgView1= new ImageView(img1);
    ImageView imgView2= new ImageView(img1);
    ImageView imgView3= new ImageView(img1);
    ImageView imgView4= new ImageView(img1);



    imgView2.setRotate(90);
    imgView3.setRotate(185);
    imgView4.setRotate(270);



        FlowPane pane=new FlowPane(imgView1, imgView2, imgView3,imgView4);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: blue");


    Scene scene= new Scene(pane, 1000, 1000);



        primaryStage.setTitle("Move Pic");
        primaryStage.setScene(scene);
        primaryStage.show();

}
}

