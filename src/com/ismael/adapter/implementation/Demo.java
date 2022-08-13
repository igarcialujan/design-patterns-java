package com.ismael.adapter.implementation;

public class Demo {
    public static void main(String[] args) {
        var client = new EmailClient();
        client.addProvider(new GmailAdapter());
        client.downloadEmails();
    }
}
