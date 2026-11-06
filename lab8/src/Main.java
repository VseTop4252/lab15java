void main() {
    Building[] buildings = {
            new Residential("ул. Ленина, 1", 9, 5400, 120),
            new Residential("ул. Пушкина, 10", 5, 3000, 60),
            new Residential("пр. Мира, 25", 12, 8400, 200),
            new Office("ул. Гагарина, 7", 3, 1500, 15),
            new Office("пр. Независимости, 50", 20, 12000, 80)
    };
    for (Building b : buildings) {
        b.displayInfo();
        System.out.println();
    }
}
