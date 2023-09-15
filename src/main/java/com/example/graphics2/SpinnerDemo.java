package com.example.graphics2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SpinnerDemo extends Application {
    private Spinner<Integer> intSpinner;
    private Spinner<String> stringSpinner;
    private Text text;

    public void start(Stage primaryStage){
        SpinnerValueFactory.IntegerSpinnerValueFactory svf= new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,5);
        intSpinner= new Spinner<Integer>(svf);

        ObservableList<String>list= FXCollections.observableArrayList();
        list.addAll("Grumpy", "Happy", "Sneezy", "Sleepy", "Dopey", "Bashful", "Doc");
        stringSpinner=new Spinner<String>(list);
        stringSpinner.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);

        StringProperty textString=new SimpleStringProperty("");

        text=new Text();
        text.setFont(new Font("Helvetica", 24));

        text.textProperty().bind(textString.concat(intSpinner.valueProperty()).concat(" and ").concat(stringSpinner.valueProperty()));

        VBox pane=new VBox(intSpinner, stringSpinner, text);
        pane.setStyle("-fx-background-color: skyblue");
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(25);

        Scene scene=new Scene(pane, 300, 250);

        primaryStage.setTitle("Spinner Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
