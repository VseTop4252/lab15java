class Residential extends Building {
    private int apartments;
    public Residential(String address, int floors, double area, int apartments) {
        super(address, floors, area);
        this.apartments = apartments;
    }
    public int getApartments() { return apartments; }
    @Override
    public String getPurpose() {
        return "Жилой дом";
    }
    public double getApartmentPrice() {
        return getArea() / apartments * 1000;
    }
}