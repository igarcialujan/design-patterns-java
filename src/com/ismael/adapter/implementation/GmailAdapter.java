package com.ismael.adapter.implementation;

import com.ismael.adapter.implementation.gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
