package objectorientedprinciples.abstraction;

public class Bike extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Bike: Accelerating accelerator...");
        // Hidden complex logic: fuel injection, gear shifting, etc.
    }

    @Override
    void brake() {
        System.out.println("Bike: Applying brakes...");
        // Hidden logic: hydraulic pressure, brake pads, etc.
    }
}
