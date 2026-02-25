public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 180, 4);
        Motorcycle m = new Motorcycle("Yamaha", 140, true);

        c.display();
        System.out.println();
        m.display();
    }
}

