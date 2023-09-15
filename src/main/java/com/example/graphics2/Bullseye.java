package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Bullseye extends Application {
    public void start (Stage primaryStage){
        Group root=new Group();
        Color ringColor=Color.BLACK;
        Circle ring=null;
        int radius=190;

        for(int count=1; count<=10; count++){
            ring=new Circle(250, 250, radius);
            ring.setFill(ringColor);
            root.getChildren().add(ring);

            if(ringColor.equals(Color.BLACK))
                ringColor=Color.WHITE;
            else
                ringColor=Color.BLACK;

            radius=radius-20;
        }
        /*ring.setFill(Color.RED);
        -> bevor der Ring rot eingefärbt wird, ist er weiss, weil er erste Ring schwarz ist (also 1=ungerade), so ist der 10. Ring (also gerade) weiss;
        danach wird die Farbe auf Rot gesetzt
         */
        Scene scene=new Scene(root, 500, 500, Color.CYAN);

        primaryStage.setTitle("Bullseye");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
