package com.example.graphics2;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class KochPane extends Pane {
    public final static double SQ=Math.sqrt(3)/6;

    public KochPane(){
        makeFractal(1);
    }

    public void makeFractal(int order){
        getChildren().clear();
        addLine(order, 200, 20, 60, 300);
        addLine(order, 60, 300, 340, 300);
        addLine(order, 340, 300, 200, 20);
    }

    public void addLine(int order, double x1, double y1, double x5, double y5){
        double deltaX,deltaY, x2,y2,x3,y3,x4,y4;

        if(order == 1){
            getChildren().add(new Line(x1,y1,x5,y5));
        }
        else{
            deltaX=x5-x1;
            deltaY=y5-y1;

            x2=x1+deltaX/3;
            y2=y1+deltaY/3;

            x3=(x1+x5)/2 + SQ * (y1-y5);
            y3=(y1+y5)/2+ SQ * (x5-x1);

            x4=x1+deltaX * 2/3;
            y4=y1+deltaY * 2/3;

            addLine(order-1, x1,y1,x2, y2);
            addLine(order-1, x2,y2,x3, y3);
            addLine(order-1, x3,y3,x4, y4);
            addLine(order-1, x4,y4,x5, y5);
        }
    }

}
