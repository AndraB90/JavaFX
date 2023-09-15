package com.example.graphics2;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Imagepic extends HBox {
    private Text imagePick;
    private RadioButton smallButton, middleButton, bigButton;
    private Image img;
    private ImageView imgView;

    public Imagepic(){

        img=new Image("Trandafiri2.jpg");
        imgView= new ImageView(img);
        imgView.setViewport(new Rectangle2D(100, 100, 100,60));

        StackPane pane=new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");

        imagePick=new Text("Chose your image size!");
        imagePick.setFont(new Font("Helvetica", 24));

        StackPane quotePane=new StackPane(imagePick);
        quotePane.setPrefSize(300, 100);

        ToggleGroup group=new ToggleGroup();

        smallButton=new RadioButton("small");
        smallButton.setSelected(true);
        smallButton.setToggleGroup(group);
        smallButton.setOnAction(this::processRadioButtonAction);

        middleButton=new RadioButton("middle");
        middleButton.setToggleGroup(group);
        middleButton.setOnAction(this::processRadioButtonAction);


        bigButton=new RadioButton("big");
        bigButton.setToggleGroup(group);
        bigButton.setOnAction(this::processRadioButtonAction);

        VBox options=new VBox(smallButton, middleButton, bigButton);
        options.setAlignment(Pos.CENTER_LEFT);
        options.setSpacing(10);


        setSpacing(20);
        getChildren().addAll(options, quotePane, pane);

    }

    public void processRadioButtonAction(ActionEvent event){
        if(smallButton.isSelected())
            imgView.setFitWidth(50);
        else if (middleButton.isSelected())
            imgView.setFitWidth(70);
        else if(bigButton.isSelected())
            imgView.setFitWidth(120);
    }

}
