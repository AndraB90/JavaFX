package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class Boxes extends Application {
    public void start (Stage primaryStage){
        Group root=new Group();
        Random gen=new Random();
        for(int count=1; count<=50; count++){
            int x=gen.nextInt(350)+1;
            int y=gen.nextInt(350)+1;

            int width=gen.nextInt(50)+1;
            int height=gen.nextInt(50)+1;

            Color fill=null;
            if(width<10 && height<10)
                fill=Color.ORANGE;
            else if(width<10)
                fill=Color.YELLOW;
            else if(height<10)
                fill=Color.GREEN;



            /*
            If a rectangle is both narrow and short, meaning its width is less than 10 and its height is less than 10, then it will be filled with the color GREEN. This is because in the code, if the width of the rectangle is less than 10, it will be filled with the color YELLOW, and if the height of the rectangle is less than 10, it will be filled with the color GREEN. Since the question specifies that the rectangle is both narrow and short, both conditions will be true, but the if statement only checks one condition at a time. Therefore, only the color associated with the first true condition will be applied, which is GREEN.

             */


            Rectangle box=new Rectangle(x,y, width, height);
            box.setStroke(Color.WHITE);
            box.setFill(fill);
            root.getChildren().add(box);



        }

        Scene scene=new Scene(root, 400, 400, Color.BLACK);

        primaryStage.setTitle("Boxes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
