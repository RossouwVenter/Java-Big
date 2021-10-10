package com.example.javafx_application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Label label;

    public void initialize(){

        button4.setEffect(new DropShadow());
//        label.setScaleX(2.0);
//        label.setScaleY(2.0);
    }
    @FXML
    public void handleMouseEnter(){
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit(){
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }
    @FXML
    public void handleClick(){
//        FileChooser chooser = new FileChooser();
        DirectoryChooser chooser = new DirectoryChooser();
        chooser.showDialog(gridPane.getScene().getWindow());
        File file = chooser.showDialog(gridPane.getScene().getWindow());
        if(file != null){
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was canceled");
        }
//        chooser.showOpenDialog(gridPane.getScene().getWindow());

    }
}