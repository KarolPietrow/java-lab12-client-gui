package org.example.lab12clientgui;

import com.fasterxml.jackson.core.JsonProcessingException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    public TextArea textArea;
    public TextField textField;

    public HelloController() {}

    @FXML
    public void onButtonClick() throws JsonProcessingException {
        String message = textField.getText();
        textArea.appendText(message + "\n");
        textField.clear();
    }

    public void onMessage(String message) {
        textArea.appendText(message + "\n");
    }
}