package org.example;

public class Laptop implements Switchable, Chargeable {
    private String model;
    private int battery;
    private boolean on;
    private double screenSize;

    public Laptop(String model, int battery, double screenSize) {
        this.model = model;
        this.battery = battery;
        this.on = false;
        this.screenSize = screenSize;
    }
    @Override
    public void turnOn() {
        if (battery > 0) {
            on = true;
            System.out.println("Ноутбук " + model + " включён");
        }
        else
        {
            System.out.println("Ноутбук " + model + " не может включиться: разряжен");
        }
    }
    @Override
    public void turnOff() {
        on = false;
        System.out.println("Ноутбук " + model + " выключен");
    }
    @Override
    public boolean isOn() {
        return on;
    }
    @Override
    public void charge() {
        battery = 100;
        System.out.println("Ноутбук " + model + " заряжен до 100%");
    }
    @Override
    public int getBatteryLevel() {
        return battery;
    }
    public double getScreenSize() { return screenSize; }
    public String getModel() { return model; }
}