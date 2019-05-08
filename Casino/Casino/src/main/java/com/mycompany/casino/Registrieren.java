/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Florian
 */
public class Registrieren {
    
    private String username;
    private String pw;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private Button zurueck;
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPW(String pw){
        this.pw = pw;
    }

    @FXML
    private void zurueck(ActionEvent event) throws IOException {
        GUILoader gl = new GUILoader();
        gl.GUILoader("Login", "Styles");
        Stage stage = new Stage();
        stage = (Stage) zurueck.getScene().getWindow();
        stage.close();
    }
    
}
