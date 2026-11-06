package org.example;

public class Apartment {
    private String addr;
    private int rooms;
    private double area;
    public static int cnt = 0;
    public static double sum = 0;
    public Apartment(String addr, int rooms, double area) {
        this.addr = addr;
        this.rooms = rooms;
        this.area = area;
        cnt++;
        sum += area;
    }
    public String getAddr() { return addr; }
    public int getRooms() { return rooms; }
    public double getArea() { return area; }
    public static double getAverageArea() {
        if (cnt == 0)
        {
            return 0;
        }
        return sum / cnt;
    }

    @Override
    public String toString() {
        return addr + " | комнат: " + rooms + " | площадь: " + area;
    }
}
