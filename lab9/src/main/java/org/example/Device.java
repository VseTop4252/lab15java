package org.example;

public abstract class Device {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    private double power;

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public void displayInfo()
    {
        System.out.println("model"+model+"power"+power);
    }
}
