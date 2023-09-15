package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Dots extends Application {

    private Color []colorList={Color.RED, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.LIME, Color.WHITE};
    private int colorIndex=0;
    private int count=0;
    private Text countText;
    private Group root;

    @Override
    public void start(Stage primaryStage) {
        countText=new Text(20, 30, "Count: 0");
        countText.setFont(new Font(18));
        countText.setFill(Color.WHITE);

        root=new Group(countText);

        Scene scene=new Scene(root, 400, 300, Color.BLACK);
        /*scene.setOnMouseClicked(this::processMouseClick);

         */

        scene.setOnMousePressed(this::processMouseClick);

        /*scene.setOnMouseReleased(this::processMouseClick);

         */

        primaryStage.setTitle("Dots");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processMouseClick(MouseEvent event){
        if(event.getClickCount()==2){
            count=0;
            colorIndex=0;
            root.getChildren().clear();
            countText.setText("Count: 0");
            root.getChildren().add(countText);
        }
        else
        {
            Circle circle=new Circle(event.getX(), event.getY(),10);
            circle.setFill(colorList[colorIndex]);
            root.getChildren().add(circle);
            colorIndex=(colorIndex+1) % colorList.length;

            count++;
            countText.setText("Count: "+count);
        }
    }
}
