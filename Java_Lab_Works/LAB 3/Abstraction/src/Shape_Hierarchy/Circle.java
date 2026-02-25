abstract class Shape {
    abstract void calculateArea();

    abstract void display();
}

class Circle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Area of Circle: pi*r²");
    }

    @Override
    public void display() {
        System.out.println("This is a Circle");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.display();

    }

}