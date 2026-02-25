public class Bike {
    String brand;
    String color;
    int year;

    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.brand = "Yamaha";
        bike.color = "Blue";
        bike.year = 2024;
        bike.displayDetails();
    }
}