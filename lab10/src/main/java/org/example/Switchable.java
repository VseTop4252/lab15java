package org.example;

public interface Switchable {
    void turnOn();
    void turnOff();
    boolean isOn();
    static String getDescription() {
        return "Устройство, которое можно включать и выключать";
    }
}
