package com.example.cookmate;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;import javafx.util.Pair;


public class StartUpPageController {
    @FXML
    private Label statusText;

    @FXML
    protected void onLoginButtonClick() {
        statusText.setText("Logging in to Cookmate!");

        // new dialog for login
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Cookmate Login");
        dialog.setHeaderText("Enter your username and password");

        // Sets button
        ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);


        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // makes username and password labels/fields
        TextField username = new TextField();
        username.setPromptText("Username");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        grid.add(new Label("Username:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(password, 1, 1);

        dialog.getDialogPane().setContent(grid);

        // request focus on username by default
        javafx.application.Platform.runLater(username::requestFocus);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(username.getText(), password.getText());
            }
            return null;
        });

        dialog.showAndWait();
    }

    @FXML
    protected void onSignupButtonClick() {
        statusText.setText("Signing Up for Cookmate!");
        // new dialog for signup
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Cookmate Signup");
        dialog.setHeaderText("Select a username and password");

        // Sets button
        ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);


        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // makes username and password labels/fields
        TextField username = new TextField();
        username.setPromptText("Username");
        PasswordField password = new PasswordField();
        password.setPromptText("Password");
        PasswordField confirmPassword = new PasswordField();
        confirmPassword.setPromptText("Re-Enter Password");

        grid.add(new Label("Username:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(password, 1, 1);
        grid.add(new Label("Confirm Password:"), 0, 2);
        grid.add(confirmPassword, 1, 2);

        dialog.getDialogPane().setContent(grid);

        // request focus on username by default
        javafx.application.Platform.runLater(username::requestFocus);

        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(username.getText(), password.getText());
            }
            return null;
        });

        dialog.showAndWait();
    }

    @FXML
    protected void onGoogleLoginButtonClick() {
        statusText.setText("Logging in with Google!");
        // TODO: add logic for button
    }

    @FXML
    protected void onFacebookLoginButtonClick() {
        statusText.setText("Logging in with Facebook!");
        // TODO: add logic for button
    }
}