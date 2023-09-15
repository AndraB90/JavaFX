package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ColorPickerTextFieldButton extends Application {
    private TextField yourText;

    private Text message;

    private ColorPicker colorPicker;

    private Button but;

    public void start(Stage primaryStage){

        yourText=new TextField("Type your text here!");

        colorPicker=new ColorPicker(Color.BLACK);

        but=new Button("Click here");
        but.setOnAction(this::processButtonChoice);

        message=new Text(yourText.getText());
        message.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 24));

        HBox pickers=new HBox(10,yourText,colorPicker, but);
        pickers.setAlignment(Pos.CENTER);

        VBox root=new VBox();
        root.setStyle("-fx-background-color: white");
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(pickers, message);

        Scene scene=new Scene(root, 400, 150);
        primaryStage.setTitle("Picker Textfield");
        primaryStage.setScene(scene);
        primaryStage.show();

        yourText.setOnAction(this::processButtonChoice);
    }

    public void processButtonChoice(ActionEvent event){

        message.setFill(colorPicker.getValue());
        message.setText(yourText.getText());
    }

}


