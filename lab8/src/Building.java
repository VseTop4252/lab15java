public class Building {
    private String address;
    private int floors;
    private double area;
    public Building(String address, int floors,double area){
        this.address=address;
        this.floors=floors;
        this.area=area;
    }
    public String getAddress() {
        return address;
    }
    public int getFloors() {
        return floors;
    }
    public double getArea() {
        return area;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public String getPurpose() {
        return "Здание";
    }
    public void displayInfo() {
        System.out.println("Адрес: " + address);
        System.out.println("Этажей: " + floors);
        System.out.println("Площадь: " + area + " м²");
        System.out.println("Назначение: " + getPurpose());
    }
}

