package com.mycompany.casino;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class StatistikController implements Initializable {
    
    @FXML
    private Label label;
    
    private String username;
    private int jettons;
    private int gesEinsat;
    private int gewinn;
    private int verlust;
    private int anzahlGespielteSpiele;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
