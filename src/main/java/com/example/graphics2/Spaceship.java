package com.example.graphics2;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Spaceship extends Group {
    public Spaceship(int size) {

        // Create the spaceship
        Polygon body = new Polygon(
                -size / 2.0, 0,
                size / 2.0, 0,
                0, -size
        );
        body.setFill(Color.GREEN);
        Polygon wing1 = new Polygon(
                -size / 4.0, 0,
                -size / 2.0, -size / 4.0,
                -size / 2.0, -size / 2.0,
                -size / 4.0, -size / 4.0
        );
        wing1.setFill(Color.YELLOW);
        Polygon wing2 = new Polygon(
                size / 4.0, 0,
                size / 2.0, -size / 4.0,
                size / 2.0, -size / 2.0,
                size / 4.0, -size / 4.0
        );
        wing2.setFill(Color.YELLOW);
        Circle window = new Circle(0, -size / 4.0, size / 6.0, Color.WHITE);

        // Add the parts of the spaceship to the group
        this.getChildren().addAll(body, wing1, wing2, window);

}
}
