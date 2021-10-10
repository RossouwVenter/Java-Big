package com.example.javafx_application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    @FXML
    private WebView webView;


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
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Zip", "*.zip"),
                new FileChooser.ExtensionFilter("PDF","*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpeg","*.jpg"),
                new FileChooser.ExtensionFilter("All Files","*.*")
        );
//        DirectoryChooser chooser = new DirectoryChooser();
//        chooser.showDialog(gridPane.getScene().getWindow());
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if(file != null){
            for(int i=0; i< file.size();i++)
            System.out.println(file.get(i));
        } else {
            System.out.println("Chooser was canceled");
        }
//        chooser.showOpenDialog(gridPane.getScene().getWindow());

    }


    @FXML
    public void handleLinkClick(){

        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
//      try{
//          Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//      } catch (IOException e){
//          e.printStackTrace();
//      }catch (URISyntaxException e) {
//          e.printStackTrace();
//      }
    }


}