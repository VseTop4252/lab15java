package org.example;
class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private double price;

    public Car(String brand, String model, int year, int mileage, double price){
        setBrand(brand);
        setModel(model);
        setYear(year);
        setMileage(mileage);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getMileage() {
        return mileage;
    }
    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            throw new InvalidCarDataException("Brand не может быть пустым");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new InvalidCarDataException("Model не может быть пустой");
        }
        this.model = model;
    }
    public void setYear(int year) {
        if (year < 1900 || year > 2025) {
            throw new InvalidCarDataException("Год должен быть в диапазоне 1900-2025, получено: " + year);
        }
        this.year = year;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            throw new InvalidCarDataException("Пробег не может быть отрицательным: " + mileage);
        }
        this.mileage = mileage;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new InvalidCarDataException("Цена должна быть > 0, получено: " + price);
        }
        this.price = price;
    }
    public void updatePrice(double newPrice) {
        if (newPrice <= 0) {
            throw new PriceUpdateException(
                    "Некорректная новая цена: " + newPrice);
        }
        if (Math.abs(newPrice - this.price) < 1e-9) {
            throw new PriceUpdateException(
                    "Новая цена совпадает со старой: " + newPrice);
        }
        this.price = newPrice;
    }

    public void addMileage(int km) {
        if (km <= 0) {
            throw new InvalidCarDataException(
                    "Добавляемый пробег должен быть > 0: " + km);
        }
        this.mileage += km;
    }

    @Override
    public String toString() {
        return String.format("Car{brand='%s', model='%s', year=%d, mileage=%d, price=%.2f}",
                brand, model, year, mileage, price);
    }
}