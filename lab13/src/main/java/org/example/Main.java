package org.example;

public class Main {
    public static void main(String[] args) {
        Car[] salon = {
                new Car("Toyota", "Camry", 2020, 45000, 2500000),
                new Car("BMW", "X5", 2019, 80000, 4200000),
                new Car("Lada", "Vesta", 2022, 12000, 1100000)
        };

        System.out.println("До:");
        for (Car c : salon)
            System.out.println(c);
        try {
            Car bought = null;
            for (int i = 0; i < salon.length; i++) {
                if (salon[i].getBrand().equals("BMW")) {
                    bought = salon[i];
                    salon[i] = null;
                    break;
                }
            }
            if (bought == null) {
                throw new CarNotFoundException("Автомобиль не найден");
            }
            System.out.println("\nКуплен: " + bought);
        } catch (CarNotFoundException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
        try {
            Car target = null;
            for (Car c : salon) {
                if (c != null && c.getBrand().equals("Toyotaaa  ") && c.getModel().equals("Camry")) {
                    target = c;
                    break;
                }
            }
            if (target == null) {
                throw new CarNotFoundException("Toyota Camry не найден");
            }
            target.updatePrice(2300000);
            System.out.println("Новая цена: " + target);
        } catch (CarNotFoundException e) {
            System.err.println("Ошибка поиска " + e.getMessage());
        } catch (PriceUpdateException e) {
            System.out.println("Ошибка изменения цены " + e.getMessage());
        }
        try {
            for (Car c : salon) {
                if (c != null && c.getBrand().equals("Lada")) {
                    c.addMileage(100);
                }
            }
        } catch (InvalidCarDataException e) {
            System.out.println("ОшибкаЦ " + e.getMessage());
        }

        System.out.println("После:");
        for (Car c : salon)
            if (c != null)
                System.out.println(c);
    }
}