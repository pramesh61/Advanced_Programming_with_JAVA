class Rectangle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Area of Rectange: l*b");

    }

    @Override
    public void display() {
        System.out.println("This is Rectangle");
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.calculateArea();
        rectangle.display();
    }
}