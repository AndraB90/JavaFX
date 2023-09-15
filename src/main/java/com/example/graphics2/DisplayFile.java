package com.example.graphics2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFile extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        FileChooser chooser=new FileChooser();
        File selectedFile=chooser.showOpenDialog(primaryStage);

        TextArea content=new TextArea();
        content.setFont(new Font("Courier", 12));
        content.setEditable(false);

        if(selectedFile == null)
            content.setText("No file chosen. ");
        else{
            Scanner scan=new Scanner(selectedFile);
            String info="";

            while(scan.hasNext())
                info +=scan.nextLine()+ "\n";

            content.setText(info);
        }

        Scene scene=new Scene(content, 500, 500);

        primaryStage.setTitle("Display File");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
