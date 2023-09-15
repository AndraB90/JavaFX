package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TiledImages extends Application {
    private final static int MIN=20;

    private Image image;
    private ColorAdjust monochrome;
    private SepiaTone sepia;
    private Group root;

    public void start (Stage primaryStage){
        image=new Image("bujori1.jpg");
        monochrome=new ColorAdjust(0,-1,0,0);
        sepia=new SepiaTone();

        root=new Group();
        addPictures(300);

        Scene scene=new Scene(root, 600, 600, Color.WHITE);
        primaryStage.setTitle("Tilded Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addPictures(double size){
        /*ImageView colorView=new ImageView(image);
        colorView.setFitWidth(size);
        colorView.setFitHeight(size);
        colorView.setX(size);
        colorView.setY(size);

        ImageView monochromeView=new ImageView(image);
        monochromeView.setEffect(monochrome);
        monochromeView.setFitWidth(size);
        monochromeView.setFitHeight(size);
        monochromeView.setX(0);
        monochromeView.setY(size);

        ImageView sepiaView=new ImageView(image);
        sepiaView.setEffect(sepia);
        sepiaView.setFitWidth(size);
        sepiaView.setFitHeight(size);
        sepiaView.setX(size);
        sepiaView.setY(0);

         */

        ImageView colorView=new ImageView(image);
        colorView.setFitWidth(size);
        colorView.setFitHeight(size);
        colorView.setX(size);
        colorView.setY(size);

        ImageView monochromeView=new ImageView(image);
        monochromeView.setEffect(monochrome);
        monochromeView.setFitWidth(size);
        monochromeView.setFitHeight(size);
        monochromeView.setX(size);
        monochromeView.setY(0);

        ImageView sepiaView=new ImageView(image);
        sepiaView.setEffect(sepia);
        sepiaView.setFitWidth(size);
        sepiaView.setFitHeight(size);
        sepiaView.setX(0);
        sepiaView.setY(size);

        root.getChildren().addAll(sepiaView, colorView, monochromeView);

        if(size > MIN)
            addPictures(size/2);
    }
}
