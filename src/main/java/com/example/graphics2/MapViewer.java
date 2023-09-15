package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MapViewer extends Application {
    public void start(Stage primaryStage) {

        Image img=new Image("map.jpg");
        ImageView imageView=new ImageView(img);

        ScrollPane root=new ScrollPane(imageView);

        Scene scene=new Scene(root, 600, 400);
        primaryStage.setTitle("Map Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
