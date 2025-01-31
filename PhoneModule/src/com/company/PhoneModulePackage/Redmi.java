package com.company.PhoneModulePackage;

import javax.swing.*;

public class Redmi extends PhoneComponent{
    @Override
    public void SwitchOn() {
        System.out.println("Swich on the Phone...!!");
        JFrame F = new JFrame("SwichOn");
        F.setSize(200,200);
        F.setLocation(200,200);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void SwitchOff(){
        System.out.println("Switch Off the Phone...!!");

        JFrame F = new JFrame("SwichOff");
        F.setSize(200,200);
        F.setLocation(200,200);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.exit(0);
    }
    @Override
    public void HomeScreen(){
        System.out.println("Home Screen Of Phone");

        JFrame F = new JFrame("HomeScreen");
        F.setSize(200,200);
        F.setLocation(200,200);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void Camera() {
        System.out.println("Opened the Camera");

        JFrame F = new JFrame("Camera");
        F.setSize(500,500);
        F.setLocation(200,200);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void MediaPlayer() {
        System.out.println("Media Player Opened...!!");

        JFrame F = new JFrame("MediaPlayer");
        F.setSize(500,500);
        F.setLocation(200,200);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
