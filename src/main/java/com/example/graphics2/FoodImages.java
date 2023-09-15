package com.example.graphics2;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FoodImages extends Application {

    private Image[] foodImages;
    private ImageView imgView;
    private ListView<String> listView;

    public void start(Stage primaryStage){
        String [] food= {"apples", "asparagus", "bacon", "bread", "carrots", "cheesecake", "eggs", "hamburger", "muffins", "onions", "oranges", "pancakes", "peanuts", "pizza", "potatoes", "pretzels", "spaghetti", "sushi", "watermelon"};
        foodImages=new Image[food.length];
        for (int i = 0; i < food.length; i++)
            foodImages[i]=new Image(food[i]+".jpg");

        imgView=new ImageView(foodImages[0]);
        StackPane imgPane=new StackPane(imgView);
        imgPane.setMinWidth(300);

        imgView.setPreserveRatio(true);
        imgView.fitWidthProperty().bind(imgPane.widthProperty());

        ObservableList<String> list= FXCollections.observableArrayList();
        list.addAll(food);

        listView=new ListView<String>(list);
        listView.setMinWidth(100);
        listView.getSelectionModel().select(0);
        listView.getSelectionModel().selectedItemProperty().addListener(this::processListSelection);

        SplitPane root=new SplitPane();
        root.setDividerPositions(0.25);
        root.getItems().addAll(listView, imgPane);

        Scene scene=new Scene(root, 600, 350);

        primaryStage.setTitle("Food Images");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processListSelection(ObservableValue<? extends String> val, String oldValue, String newValue){
        int index=listView.getSelectionModel().getSelectedIndex();
        imgView.setImage(foodImages[index]);
    }
}
