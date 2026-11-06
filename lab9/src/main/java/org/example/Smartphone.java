package org.example;

public class Smartphone extends Device {
    private double cameraMP;

    public double getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(double cameraMP) {
        this.cameraMP = cameraMP;
    }
    public Smartphone(double cameramp, String model, double power){
        this.setPower(power);
        this.setModel(model);
        this.cameraMP=cameramp;
    }
    @Override
    public void turnOff() {
        System.out.println("Смартфон выключился");
    }

    @Override
    public void turnOn() {
        System.out.println("Смартфон включился");
    }
}
