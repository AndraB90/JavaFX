package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class BattleTank extends Application {
    private Tank tank;
    private Group root;
    private Line laserBeam;

    public void start(Stage primaryStage) {
        root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);

        tank = new Tank(50, 50);
        root.getChildren().add(tank.getNode());

        laserBeam = new Line();
        laserBeam.setStroke(Color.RED);
        laserBeam.setStrokeWidth(3);
        laserBeam.setVisible(false);
        root.getChildren().add(laserBeam);

        scene.setOnMouseMoved(this::processMouseMove);
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseReleased(this::processMouseRelease);

        primaryStage.setTitle("Battle Tank");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void processMouseMove(MouseEvent event) {
        tank.moveTo(event.getX(), event.getY());
    }

    private void processMousePress(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            laserBeam.setStartX(tank.getGunTip().getX());
            laserBeam.setStartY(tank.getGunTip().getY());
            laserBeam.setEndX(event.getX());
            laserBeam.setEndY(event.getY());
            laserBeam.setVisible(true);
        }
    }

    private void processMouseRelease(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            laserBeam.setVisible(false);
        }
}
}
