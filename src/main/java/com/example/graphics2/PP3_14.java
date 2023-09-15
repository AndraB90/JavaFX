package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class PP3_14 extends Application {
    public void start(Stage primaryStage){
        Text name=new Text(120,100, "ANDRA BOTEAN");
        Random r= new Random();
        int degree=r.nextInt(361);
        name.setRotate(degree);

        Group root=new Group(name);
        Scene scene=new Scene(root, 500, 500, Color.PINK);

        primaryStage.setTitle("PP3.14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
