package com.example.graphics2;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TrafficLights extends HBox {

        private Text colorPick;
        private RadioButton redButton1, yellowButton1, greenButton1;
        private Circle Red, Yellow, Green;

        public TrafficLights(){

            Red=new Circle(30, 50, 50);
            Yellow=new Circle(30, 80, 50);
            Green=new Circle(30, 110, 50);


            colorPick=new Text("Chose your color!");
            colorPick.setFont(new Font("Helvetica", 24));

            StackPane quotePane=new StackPane(colorPick);
            quotePane.setPrefSize(300, 100);

            ToggleGroup group=new ToggleGroup();

            redButton1=new RadioButton("red");
            redButton1.setSelected(true);
            redButton1.setToggleGroup(group);
            redButton1.setOnAction(this::processRadioButtonAction);

            yellowButton1=new RadioButton("yellow");
            yellowButton1.setToggleGroup(group);
            yellowButton1.setOnAction(this::processRadioButtonAction);


            greenButton1=new RadioButton("green");
            greenButton1.setToggleGroup(group);
            greenButton1.setOnAction(this::processRadioButtonAction);

            VBox options=new VBox(redButton1, yellowButton1, greenButton1);
            options.setAlignment(Pos.CENTER_LEFT);
            options.setSpacing(10);


            setSpacing(20);
            getChildren().addAll(options, quotePane, Red, Yellow, Green);

        }

        public void processRadioButtonAction(ActionEvent event){
            Red.setFill(Color.BLACK);
            Yellow.setFill(Color.BLACK);
            Green.setFill(Color.BLACK);
            if(redButton1.isSelected())
                Red.setFill(Color.RED);
            else if (yellowButton1.isSelected())
                Yellow.setFill(Color.YELLOW);
            else if(greenButton1.isSelected())
                Green.setFill(Color.GREEN);
        }


}
