package com.example.graphics2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class QuoteSpinner extends Application {
    private javafx.scene.control.Spinner<String> chategorySpinner;
    private javafx.scene.control.Spinner<String> stringSpinner;
    private Text text;

    public void start(Stage primaryStage) {

        ObservableList<String> categories = FXCollections.observableArrayList("philosophyQuote", "carpentryQuote", "comedyQuote");
        chategorySpinner = new javafx.scene.control.Spinner<String>(categories);
        chategorySpinner.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);

        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("I think, therefore I am.", "Measure twice. Cut once. ", "Take my wife, please");
        stringSpinner = new javafx.scene.control.Spinner<String>(list);
        stringSpinner.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);

        StringProperty textString = new SimpleStringProperty("");

        text = new Text();
        text.setFont(new Font("Helvetica", 24));


        VBox pane = new VBox(chategorySpinner, stringSpinner, text);
        pane.setStyle("-fx-background-color: skyblue");
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(25);

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("Spinner Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        chategorySpinner.valueProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                Text cathegory = null;
                switch (newValue) {
                    case "philosophyQuote":
                        cathegory = new Text("I think, therefore I am.");
                        break;
                    case " carpentryQuote":
                        cathegory = new Text("Measure twice. Cut once. ");
                        break;
                    case "comedyQuote":
                        cathegory = new Text("Take my wife, please");
                        break;

                }
                if (cathegory != null) {
                    text.setText("Selected Quote: " + newValue);
                    pane.getChildren().remove(cathegory);
                    pane.getChildren().add(cathegory);
                }
            }
        });
    }

}
