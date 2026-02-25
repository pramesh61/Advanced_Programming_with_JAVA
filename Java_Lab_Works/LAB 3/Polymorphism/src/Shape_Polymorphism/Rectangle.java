class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return l * b;
    }

    @Override
    void display() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}
