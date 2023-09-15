package com.example.graphics2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PropertyBindingDemo extends Application {

    public void start(Stage primaryStage){
        Group root=new Group();
        Scene scene=new Scene(root, 300, 200, Color.SKYBLUE);

        Circle center=new Circle(6);
        center.centerXProperty().bind(scene.widthProperty().divide(2));
        center.centerYProperty().bind(scene.heightProperty().divide(2));

        StringProperty width=new SimpleStringProperty("Width: ");
        StringProperty height=new SimpleStringProperty("Height: ");

        Text widthText=new Text(20,30, "");
        widthText.textProperty().bind(width.concat(scene.widthProperty()));

        Text heightText=new Text(20,60, "");
        heightText.textProperty().bind(height.concat(scene.heightProperty()));

        root.getChildren().addAll(center, widthText,heightText);

        primaryStage.setTitle("Property Binding Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
