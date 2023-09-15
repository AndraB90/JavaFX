package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ArcDisplay extends Application {
    public void start(Stage primaryStage){
        Ellipse backgroundEllipse=new Ellipse(250, 150,170,100);
        backgroundEllipse.setFill(null);
        backgroundEllipse.setStroke(Color.GRAY);
        backgroundEllipse.getStrokeDashArray().addAll(5.0, 5.0);

        Arc arc1= new Arc(250, 150, 170, 100, 90, 90);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.RED);
        arc1.setFill(null);

        Arc arc2= new Arc(250, 150, 170, 100, 20, 50);
        arc2.setType(ArcType.ROUND);
        arc2.setStroke(Color.GREEN);
        arc2.setFill(Color.DARKGREEN);

        Arc arc3= new Arc(250, 150, 170, 100, 230, 130);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLUE);
        arc3.setFill(null);

        Arc arc4=new Arc(50, 50, 40, 100, 0,180);
        arc4.setType(ArcType.CHORD);
        arc4.setStroke(Color.YELLOW);
        arc4.setFill(Color.YELLOW);

        Group root=new Group(backgroundEllipse, arc1, arc2, arc3, arc4);
        Scene scene= new Scene(root, 500, 300, Color.LIGHTYELLOW);

        primaryStage.setTitle("Arc Display");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

}
