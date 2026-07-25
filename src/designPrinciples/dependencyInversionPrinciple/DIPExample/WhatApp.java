package designPrinciples.dependencyInversionPrinciple.DIPExample;

public class WhatApp implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("WhatsApp sent : "+message);
    }
}
