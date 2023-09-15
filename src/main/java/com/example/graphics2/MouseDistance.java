package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseDistance extends Application {
    private Line line;
    private Text distanceText;
    private double total;
    private double lastX;
    private double lastY;

    public void start (Stage primaryStage){
        line=new Line(0,0, 0, 0);
        line.setStroke(null);
        distanceText=new Text(150, 30, "Distance: --");

        Group root=new Group(distanceText, line);

        Scene scene=new Scene(root, 400, 300, Color.LIGHTYELLOW);
        scene.setOnMouseClicked(this::processMouseClick);

        primaryStage.setTitle("Click Distance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processMouseClick(MouseEvent event){
        double clickX=event.getX();
        double clickY=event.getY();

        if(lastX !=0 && lastY !=0){
        double distance=Math.sqrt(clickX*clickX+clickY*clickY);
        total=total+distance;

        String distanceStr=String.format("%2f", total);
        distanceText.setText("Distance : "+distanceStr);
    }

    line.setStartX(lastX);
        line.setStartY(lastY);
        line.setEndX(clickX);
        line.setEndY(clickY);

        lastX = clickX;
        lastY = clickY;
}
}
