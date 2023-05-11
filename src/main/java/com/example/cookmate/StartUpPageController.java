package com.example.cookmate;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class StartUpPageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onLoginButtonClick() {
        welcomeText.setText("Signing Up for Cookmate!");
    }
}