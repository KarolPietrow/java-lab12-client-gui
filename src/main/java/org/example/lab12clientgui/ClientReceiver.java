package org.example.lab12clientgui;

public class ClientReceiver {
    public static ConnectionThread thread;
    public static HelloController controller;

    public ClientReceiver(ConnectionThread thread, HelloController controller) {
        this.thread = thread;
        this.controller = controller;
    }

    public  void receiveBroadcast(String message) {
        controller.onMessage(message);
    }

    public void receiveDM(Message message) {
        controller.onMessage(message.username + " (WIADOMOŚĆ PRYWATNA): " + message.content);
    }
}
