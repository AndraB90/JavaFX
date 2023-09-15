package com.example.graphics2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LightBulb extends Application {

    private Button onButton, offButton;
    private ImageView bulbView;

    public void start(Stage primaryStage){
        Image img=new Image("lightBulbs.png");
        bulbView=new ImageView(img);
        bulbView.setViewport(new Rectangle2D(0,0,125,200));

        onButton=new Button("On");
        onButton.setPrefWidth(70);
        onButton.setTooltip(new Tooltip("Turn me on! "));
        onButton.setOnAction(this::processButtonPress);

        offButton=new Button("Off");
        offButton.setPrefWidth(70);
        offButton.setTooltip(new Tooltip("Turn me off! "));
        offButton.setDisable(true);
        offButton.setOnAction(this::processButtonPress);

        HBox buttons=new HBox(onButton, offButton);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(30);

        VBox root=new VBox(bulbView, buttons);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: black");
        root.setSpacing(20);

        Scene scene=new Scene(root,250,300);

        primaryStage.setTitle("Light Bulb");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processButtonPress(ActionEvent event){
        if(event.getSource() == onButton){
            bulbView.setViewport(new Rectangle2D(143, 0,125,200));
            onButton.setDisable(true);
            offButton.setDisable(false);
        }
        else{
            bulbView.setViewport(new Rectangle2D(0,0,125,200));
            offButton.setDisable(true);
            onButton.setDisable(false);
        }
    }


}
