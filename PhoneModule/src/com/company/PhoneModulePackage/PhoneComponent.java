package com.company.PhoneModulePackage;
abstract public class PhoneComponent {
    abstract public void SwitchOn();
    abstract public void SwitchOff();
    abstract public void HomeScreen();
    abstract public void Camera();
    abstract public void MediaPlayer();
}

class UseComponent extends PhoneComponent {
    @Override
    public void SwitchOn() {
        System.out.println("Swich on the Phone...!!");
    }
    @Override
    public void SwitchOff(){
        System.out.println("Switch Off the Phone...!!");
    }
    @Override
    public void HomeScreen(){
        System.out.println("Home Screen Of Phone");
    }
    @Override
    public void Camera() {
        System.out.println("Opened the Camera");
    }
    @Override
    public void MediaPlayer() {
        System.out.println("Media Player Opened...!!");
    }

}

