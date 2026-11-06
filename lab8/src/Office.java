class Office extends Building {
    private int companies;

    public Office(String address, int floors, double area, int companies) {
        super(address, floors, area);
        this.companies = companies;
    }

    public int getCompanies() { return companies; }

    @Override
    public String getPurpose() {
        return "Офис";
    }

    public double getRentPrice() {
        return getArea() * 15;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Companies"+companies);
    }
}