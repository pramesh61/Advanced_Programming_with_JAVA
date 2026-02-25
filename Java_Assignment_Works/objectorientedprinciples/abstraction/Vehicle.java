package objectorientedprinciples.abstraction;

public abstract class Vehicle {
    // Abstract methods (what it can do)
    abstract void accelerate();
    abstract void brake();
    
    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}
