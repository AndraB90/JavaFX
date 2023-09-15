package com.example.graphics2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.scene.AmbientLight;
import javafx.scene.shape.Sphere;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;

public class pie_chart_1 extends Application{
    public void start(Stage stage)
    {
        // set title for the stage
        stage.setTitle("Creating Pie Chart");

        // piechart data
        PieChart.Data data[] = new PieChart.Data[5];

        // string and integer data
        String status[] = {"Correct Answer", "Wrong Answer",
                "Compilation Error", "Runtime Error",
                "Others" };

        int values[] = {20, 30, 10, 4, 2};

        for (int i = 0; i < 5; i++) {
            data[i] = new PieChart.Data(status[i], values[i]);
        }

        // create a pie chart
        PieChart pie_chart = new
                PieChart(FXCollections.observableArrayList(data));

        // create a Group
        Group group = new Group(pie_chart);

        // create a scene
        Scene scene = new Scene(group, 500, 300);

        // set the scene
        stage.setScene(scene);

        stage.show();
    }

}
