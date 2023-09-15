package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AlienDirection extends Application {
    public final static int JUMP=10;

    private ImageView imageView;
    private Scene scene;

    @Override
    public void start(Stage primaryStage)  {

        Image alien=new Image("alien.png");

        imageView=new ImageView(alien);
        imageView.setX(20);
        imageView.setY(20);

        Group root=new Group(imageView);

        scene=new Scene(root, 1000, 800, Color.BLACK);
        scene.setOnKeyPressed(this::processKeyPress);

        primaryStage.setTitle("Alien Direction");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processKeyPress(KeyEvent event){
        switch (event.getCode()) {
            case UP:
                imageView.setY(imageView.getY() - JUMP);
                break;
            case DOWN:
                imageView.setY(imageView.getY() + JUMP);
                break;
            case RIGHT:
                imageView.setX(imageView.getX() + JUMP);
                break;
            case LEFT:
                imageView.setX(imageView.getX() - JUMP);
                break;
            default:
                break;
        }

            if (imageView.getLayoutBounds().getMinX() < 0)
            {
                imageView.setX(0);
            }
            else if(imageView.getLayoutBounds().getMaxX() > scene.getWidth() )
            {
                imageView.setX(imageView.getX() - JUMP);
            }

        if (imageView.getLayoutBounds().getMinY() < 0)
        {
            imageView.setY(0);
        }
        else if(imageView.getLayoutBounds().getMaxY() > scene.getHeight() )
        {
            imageView.setY(imageView.getY() - JUMP);
        }
        }
    }

