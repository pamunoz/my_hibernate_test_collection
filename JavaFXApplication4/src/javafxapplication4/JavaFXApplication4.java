/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class JavaFXApplication4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 380, 200, Color.WHITE);
        
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
         // Fuxed fir Labels
        ColumnConstraints constraints1 = new ColumnConstraints(100);
        // min, pref, max
        ColumnConstraints constraints2 = new ColumnConstraints(50, 150, 300); 
        constraints2.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(constraints1, constraints2);
        
        Label lblFirstName = new Label("First Name");
        Label lblLastName = new Label("Last Name");
        Label lblDOB = new Label("DOB");
        
        TextField firstName = new TextField();
        TextField lastName = new TextField();
        TextField DOB = new TextField();
        
        Button saveBtn = new Button("Save");
        
        // First Name Label
        GridPane.setHalignment(lblFirstName, HPos.RIGHT);
        gridPane.add(lblFirstName, 0, 0);
        
        // Last Name Label
        GridPane.setHalignment(lblLastName, HPos.RIGHT);
        gridPane.add(lblLastName, 0, 1);
        
        // DOB Label
        GridPane.setHalignment(lblDOB, HPos.RIGHT);
        gridPane.add(lblDOB, 0, 2);
        
        // First Name Textfield
        GridPane.setHalignment(firstName, HPos.LEFT);
        gridPane.add(firstName, 1, 0);
        
        // Last Name Textfield
        GridPane.setHalignment(lastName, HPos.LEFT);
        gridPane.add(lastName, 1, 1);
        
        // Last Name Textfield
        GridPane.setHalignment(DOB, HPos.LEFT);
        gridPane.add(DOB, 1, 2);
        
        // Save button
        GridPane.setHalignment(saveBtn, HPos.RIGHT);
        gridPane.add(saveBtn, 1, 3);
        
        FlowPane header = new FlowPane();
        header.setPrefHeight(40);
        
        // Css
        String background = 
                "-fx-background-color: lightblue;" +
                "-fx-background-radius : 0%" +
                "-fx-background-inset : 5px;";
        header.setStyle(background);
        
        SVGPath icon = new SVGPath();
        icon.setContent("<svg fill=\"#000000\" height=\"24\" viewBox=\"0 0 24 24\" width=\"24\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
"    <path d=\"M0 0h24v24H0z\" fill=\"none\"/>\n" +
"    <path d=\"M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm1 15h-2v-6h2v6zm0-8h-2V7h2v2z\"/>\n" +
"</svg>");
        icon.setStroke(Color.LIGHTGREY);
        icon.setFill(Color.WHITE);
        
        Text text = new Text("Info");
        Font font = new Font("Serif", 30);
        text.setFont(font);
        text.setFill(Color.WHITE);
             
        header.getChildren().addAll(icon, text);
                
        root.setTop(header);
        root.setCenter(gridPane);
        
        
        primaryStage.setTitle("JavaFX 8 Tutorial 7 - BorderPane, GridPane, FlowPane, Label, TextField, Button and SVGPath!");
        primaryStage.setScene(scene);
        primaryStage.show();// http://raphaeljs.com/icons/#i
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
