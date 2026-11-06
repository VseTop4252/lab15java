package org.example;

public class Smartphone implements Switchable, Chargeable {
    private String model;
    private int battery;   // 0..100
    private boolean on;

    public Smartphone(String model, int battery) {
        this.model = model;
        this.battery = battery;
        this.on = false;
    }
    @Override
    public void turnOn() {
        if (battery > 0) {
            on = true;
            System.out.println("Смартфон " + model + " включён");
        } else {
            System.out.println("Смартфон " + model + " не может включиться: разряжен");
        }
    }
    @Override
    public void turnOff() {
        on = false;
        System.out.println("Смартфон " + model + " выключен");
    }
    @Override
    public boolean isOn() {
        return on;
    }
    @Override
    public void charge() {
        battery = 100;
        System.out.println("Смартфон " + model + " заряжен до 100%");
    }
    @Override
    public int getBatteryLevel() {
        return battery;
    }
    public String getModel() { return model; }
}