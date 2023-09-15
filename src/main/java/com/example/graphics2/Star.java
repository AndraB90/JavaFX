package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Star extends Polygon {
    public Star(double centerX, double centerY, double radius, Color color) {
        List<Double> points = createStarPoints(centerX, centerY, radius);
        getPoints().addAll(points);
        setFill(color);
    }

    private List<Double> createStarPoints(double centerX, double centerY, double radius) {
        List<Double> points = new ArrayList<>();
        double angle = Math.PI / 2;
        double angleIncrement = Math.PI / 5;

        for (int i = 0; i < 10; i++) {
            double pointRadius = (i % 2 == 0) ? radius : radius / 2;
            points.add(centerX + pointRadius * Math.cos(angle));
            points.add(centerY - pointRadius * Math.sin(angle));
            angle += angleIncrement;
        }

        return points;
    }


}
