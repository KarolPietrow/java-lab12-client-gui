package org.example.lab12clientgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        ConnectionThread thread = new ConnectionThread("localhost", 5005);
        thread.start();

        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Logowanie");
        dialog.setContentText("Proszę podać nazwę użytkownika.");

        Optional<String> username = dialog.showAndWait();

        if (username.isPresent()) {
            thread.login(username.get());

            stage.setTitle("Klient czatu sieciowego GUI");
            stage.setScene(scene);
            stage.show();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}