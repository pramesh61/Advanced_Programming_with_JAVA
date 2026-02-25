class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        return 3.14 * r * r;
    }

    @Override
    void display() {
        System.out.println("Circle Area: " + calculateArea());
    }
}
