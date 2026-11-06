package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Laptop honor = new Laptop(14.1,"MagicBook x16",65);
        Laptop honor1 = new Laptop(12.1,"MagicBook x16 mini",45);
        Smartphone pocox6promax = new Smartphone(65,"Poco x6 pro max dark brawlstars edition",67);
        Smartphone pocof6 = new Smartphone(65,"Poco f6 pro max",120);
        Smartphone pocoC6 = new Smartphone(65,"Poco C6 pro max",45);
        honor.turnOn();
        honor.turnOff();
        honor1.turnOff();
        honor1.turnOn();
        pocox6promax.turnOff();
        pocox6promax.turnOn();
        pocoC6.turnOn();
        pocoC6.turnOff();
        pocof6.turnOff();
        pocof6.turnOn();
    }
}
