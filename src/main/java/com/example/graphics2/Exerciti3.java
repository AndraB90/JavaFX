package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Exerciti3 extends Application {
    public void start (Stage primaryStage){
        Ellipse elip=new Ellipse(300, 100, 50, 10);
        Ellipse elip2=new Ellipse(100, 200, 20, 40);
        Ellipse elip3=new Ellipse(150, 220, 60, 30);
        /*elip.setFill(null);

         */


        Group root= new Group(elip, elip2, elip3);
        root.setTranslateX(100);
        root.setTranslateY(20);
        Scene scene= new Scene(root, 500, 350, Color.FORESTGREEN);

        primaryStage.setTitle("3.17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
