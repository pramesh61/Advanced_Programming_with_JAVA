class Motorcycle extends Vehicle {
    private final boolean hasGear;

    Motorcycle(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Has Gear: " + hasGear);
    }
}
