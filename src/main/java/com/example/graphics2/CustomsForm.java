package com.example.graphics2;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CustomsForm extends VBox {

    private Text yourGoods;
    private CheckBox FoodCheckbox, BeautyCheckbox, CarCheckbox, BoatCheckbox, BikeCheckbox;


    public CustomsForm() {

        Label labelresponse=new Label();

        yourGoods = new Text("Choose your goods to check your entry fees!");
        yourGoods.setFont(new Font("Helvetica", 36));
        FoodCheckbox = new CheckBox("Food");
        FoodCheckbox.setOnAction(this::processCheckBoxAction);
        BeautyCheckbox = new CheckBox("Beauty");
        BeautyCheckbox.setOnAction(this::processCheckBoxAction);
        CarCheckbox = new CheckBox("Car");
        CarCheckbox.setOnAction(this::processCheckBoxAction);
        BoatCheckbox = new CheckBox("Beauty");
        BoatCheckbox.setOnAction(this::processCheckBoxAction);
        BikeCheckbox = new CheckBox("Beauty");
        BikeCheckbox.setOnAction(this::processCheckBoxAction);



        HBox options = new HBox(FoodCheckbox, BeautyCheckbox, CarCheckbox, BoatCheckbox, BikeCheckbox);
        options.setAlignment(Pos.CENTER);
        options.setSpacing(20); // between the check boxes
        setSpacing(20);
        getChildren().addAll(yourGoods, options);


    }



    public void processCheckBoxAction(ActionEvent event){

    int sum=0;
    int foodfee=10;
    int beautyfee=5;
    int carfee=120;
    int boatfee=300;
    int bikefee=50;

        if (FoodCheckbox.isSelected())
            sum = sum+foodfee;
        if (BeautyCheckbox.isSelected())
            sum=sum+beautyfee;
        if(CarCheckbox.isSelected())
            sum=sum+carfee;
        if(BoatCheckbox.isSelected())
            sum=sum+boatfee;
        if(BikeCheckbox.isSelected())
            sum=sum+bikefee;

        System.out.println(sum);


    }
}


