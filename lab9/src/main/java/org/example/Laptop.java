package org.example;

import java.sql.SQLOutput;

public class Laptop extends Device {
    public double screenSize;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public Laptop(double screenSize, String model, double power){
        this.setPower(power);
        this.setModel(model);
        this.screenSize=screenSize;
    }
    @Override
    public void turnOn() {
        System.out.println("Ноутбук включился");
    }

    @Override
    public void turnOff() {
        System.out.println("Ноутбук выключился");
    }
}
