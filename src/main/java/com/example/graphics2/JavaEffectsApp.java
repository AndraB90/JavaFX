package com.example.graphics2;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

    public class JavaEffectsApp extends Application {

        private Text text;
        private ListView<String> effectsList;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) {
            text = new Text("Hello, World!");
            text.setFont(new Font(20));

            effectsList = new ListView<>();
            effectsList.getItems().addAll(
                    "DropShadow", "Glow", "Reflection", "SepiaTone", "BoxBlur", "InnerShadow"
            );
            effectsList.getSelectionModel().selectedItemProperty().addListener(
                    (observable, oldValue, newValue) -> applyEffect(newValue)
            );

            SplitPane splitPane = new SplitPane();
            splitPane.setOrientation(Orientation.HORIZONTAL);
            splitPane.getItems().addAll(effectsList, text);
            splitPane.setDividerPosition(0, 0.3);

            Scene scene = new Scene(splitPane, 600, 400);
            stage.setScene(scene);
            stage.setTitle("Visual Effects App");
            stage.show();
        }

        private void applyEffect(String effectName) {
            Effect effect = null;

            switch (effectName) {
                case "DropShadow":
                    effect = new DropShadow();
                    break;
                case "Glow":
                    effect = new Glow();
                    break;
                case "Reflection":
                    effect = new Reflection();
                    break;
                case "SepiaTone":
                    effect = new SepiaTone();
                    break;
                case "BoxBlur":
                    effect = new BoxBlur();
                    break;
                case "InnerShadow":
                    effect = new InnerShadow();
                    break;
            }

            text.setEffect(effect);
        }
    }


