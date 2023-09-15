package com.example.graphics2;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ColorpickPane extends HBox {
    private Text colorPick;
    private RadioButton redButton, yellowButton, blueButton, orangeButton, greenButton;
    private Rectangle Box;

    public ColorpickPane(){

        Box=new Rectangle(30, 50, 50, 50);


        colorPick=new Text("Chose your color!");
        colorPick.setFont(new Font("Helvetica", 24));

        StackPane quotePane=new StackPane(colorPick);
        quotePane.setPrefSize(300, 100);

        ToggleGroup group=new ToggleGroup();

        redButton=new RadioButton("red");
        redButton.setSelected(true);
        redButton.setToggleGroup(group);
        redButton.setOnAction(this::processRadioButtonAction);

        yellowButton=new RadioButton("yellow");
        yellowButton.setToggleGroup(group);
        yellowButton.setOnAction(this::processRadioButtonAction);

        blueButton=new RadioButton("blue");
        blueButton.setToggleGroup(group);
        blueButton.setOnAction(this::processRadioButtonAction);

        orangeButton=new RadioButton("orange");
        orangeButton.setToggleGroup(group);
        orangeButton.setOnAction(this::processRadioButtonAction);

        greenButton=new RadioButton("green");
        greenButton.setToggleGroup(group);
        greenButton.setOnAction(this::processRadioButtonAction);

        VBox options=new VBox(redButton, yellowButton, blueButton, orangeButton, greenButton);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(10);


        setSpacing(20);
        getChildren().addAll(options, quotePane, Box);

    }

    public void processRadioButtonAction(ActionEvent event){
        if(redButton.isSelected())
            Box.setFill(Color.RED);
        else if (yellowButton.isSelected())
            Box.setFill(Color.YELLOW);
        else if(blueButton.isSelected())
            Box.setFill(Color.BLUE);
        else if(orangeButton.isSelected())
            Box.setFill(Color.ORANGE);
        else if(greenButton.isSelected())
            Box.setFill(Color.GREEN);
        else
            Box.setFill(Color.BLACK);
    }
}

