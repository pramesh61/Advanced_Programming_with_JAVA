package objectorientedprinciples.abstraction;

public class Main {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.startEngine();
        myBike.accelerate();
        myBike.brake();
    }
}
