package com.ismael.template_method.implementation;

public class ChatWindow extends Window {
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from the server...");
    }
}
