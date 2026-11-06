package org.example;

public interface Chargeable {
    public int charg=1;
    void charge();
    int getBatteryLevel();
    static String getChargeInfo() {
        return "Устройство, поддерживающее зарядку";
    }
}