package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class BrickWall extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group group_for_bricks = new Group() ;

        primaryStage.setTitle( "BrickWallFX.java" ) ;

        Scene scene = new Scene( group_for_bricks, 960, 720 ) ;

        scene.setFill( Color.ORANGE ) ;


        int brick_position_x  =  0 ;
        int brick_position_y  =  0 ;

        int brick_height  =   28 ;
        int brick_length  =  112 ;
        int gap_between_bricks =  4 ;
        int row_counter = 0 ;

        while ( brick_position_y  <  scene.getHeight() )
        {
            while ( brick_position_x < scene.getWidth() )
            {
                Rectangle new_brick =
                        new Rectangle( brick_position_x, brick_position_y,
                                brick_length, brick_height ) ;

                new_brick.setFill( Color.FIREBRICK ) ;

                group_for_bricks.getChildren().add( new_brick ) ;

                brick_position_x = brick_position_x
                        + brick_length + gap_between_bricks ;
            }

            // Now we must prepare to do the next row of bricks.
            // Every second row must start with a half brick.
            row_counter ++ ;

            if ( row_counter % 2 == 1 )
            {
                // This row will start with a half brick.

                brick_position_x = - brick_length / 2 ;
            }
            else
            {
                brick_position_x = 0 ;
            }

            brick_position_y = brick_position_y + brick_height + gap_between_bricks ;

        }

        primaryStage.setScene( scene ) ;
        primaryStage.show() ;

    }


}

