package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFileExtended extends Application {
    private TextArea content;
    private File selectedFile;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        selectedFile = fileChooser.showOpenDialog(primaryStage);

        content = new TextArea();
        content.setFont(new Font("Courier", 12));
        content.setEditable(true);

        if (selectedFile == null) {
            content.setText("No file chosen.");
        } else {
            try {
                Scanner scanner = new Scanner(selectedFile);
                StringBuilder fileContent = new StringBuilder();

                while (scanner.hasNext()) {
                    fileContent.append(scanner.nextLine()).append("\n");
                }

                content.setText(fileContent.toString());
                scanner.close();
            } catch (IOException e) {
                content.setText("An error occurred while reading the file.");
                e.printStackTrace();
            }
        }

        Button saveButton = new Button("Save");
        saveButton.setOnAction(event -> saveFile(primaryStage));

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(content, saveButton);

        BorderPane root = new BorderPane();
        root.setCenter(vbox);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Display File Extended");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void saveFile(Stage stage) {
        if (selectedFile == null) {
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save File");
        File outputFile = fileChooser.showSaveDialog(stage);

        if (outputFile != null) {
            try {
                FileWriter writer = new FileWriter(outputFile);
                writer.write(content.getText());
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while saving the file.");
                e.printStackTrace();
            }
        }
    }
}