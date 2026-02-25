public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);

        for (Shape s : shapes) {
            s.display();
        }
    }
}
