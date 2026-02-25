class Car extends Vehicle {
    private final int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }
}
