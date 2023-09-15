package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Form extends GridPane {

    private Label name;
    private TextField nameValue;
    private Label age;
    private TextField ageValue;
    private Label favoriteColor;
    private TextField favoriteColorValue;
    private Label hobby;
    private TextField hobbyValue;

    public Form(){
        Font font= new Font(18);

        name= new Label("Your Name:");
        name.setFont(font);
        GridPane.setHalignment(name, HPos.RIGHT);

        age= new Label("Your Age:");
        age.setFont(font);
        GridPane.setHalignment(age, HPos.RIGHT);

        favoriteColor= new Label("Your Favorite Color:");
        favoriteColor.setFont(font);
        GridPane.setHalignment(favoriteColor, HPos.RIGHT);

        hobby= new Label("Your Hobby: ");
        hobby.setFont(font);
        GridPane.setHalignment(hobby, HPos.RIGHT);


        nameValue=new TextField();
        nameValue.setFont(font);
        nameValue.setPrefWidth(100);
        nameValue.setAlignment(Pos.CENTER);


        ageValue=new TextField();
        ageValue.setFont(font);
        ageValue.setPrefWidth(100);
        ageValue.setAlignment(Pos.CENTER);


        favoriteColorValue=new TextField();
        favoriteColorValue.setFont(font);
        favoriteColorValue.setPrefWidth(100);
        favoriteColorValue.setAlignment(Pos.CENTER);


        hobbyValue=new TextField();
        hobbyValue.setFont(font);
        hobbyValue.setPrefWidth(100);
        hobbyValue.setAlignment(Pos.CENTER);

        Button button = new Button("Print!");
        GridPane.setHalignment(button, HPos.RIGHT);
        button.setOnAction(this::processButtonPress);


        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");

        add(name, 0, 0);
        add(nameValue,1,0);
        add(age, 0, 1);
        add(ageValue, 1, 1);
        add(favoriteColor, 0,2);
        add(favoriteColorValue, 1,2);
        add(hobby,0,3 );
        add(hobbyValue, 1, 3);
        add(button, 0,4);

    }

    public void processButtonPress(ActionEvent event) {
        System.out.println("Your name is: "+nameValue.getText());
        System.out.println("Your age is: "+ageValue.getText());
        System.out.println("Your favorite color is: "+favoriteColorValue.getText());
        System.out.println("Your hobby is: "+hobbyValue.getText());

    }
}
