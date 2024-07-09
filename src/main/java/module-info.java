module org.example.lab12clientgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;


    opens org.example.lab12clientgui to javafx.fxml;
    exports org.example.lab12clientgui;
}