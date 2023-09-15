package com.example.graphics2;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Tank {
    private double x;
    private double y;
    private Circle body;
    private Circle turret;
    private Line gun;

    public Tank(double x, double y) {
        this.x = x;
        this.y = y;
        this.body = new Circle(x, y, 30, Color.GREEN);
        this.turret = new Circle(x, y, 20, Color.DARKGREEN);
        this.gun = new Line(x, y, x, y - 30);
        this.gun.setStroke(Color.DARKGRAY);
        this.gun.setStrokeWidth(10);
        this.gun.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
    }

    public void moveTo(double x, double y) {
        double deltaX = x - this.x;
        double deltaY = y - this.y;
        double angle = Math.atan2(deltaY, deltaX);
        this.body.setCenterX(x);
        this.body.setCenterY(y);
        this.turret.setCenterX(x + 30 * Math.cos(angle));
        this.turret.setCenterY(y + 30 * Math.sin(angle));
        this.gun.setEndX(x + 60 * Math.cos(angle));
        this.gun.setEndY(y + 60 * Math.sin(angle));
    }

    public Point2D getGunTip() {
        return new Point2D(gun.getEndX(), gun.getEndY());
    }

    public Group getNode() {
        Group node = new Group(body, turret, gun);
        node.setTranslateX(-45);
        node.setTranslateY(-30);
        return node;
    }
}

