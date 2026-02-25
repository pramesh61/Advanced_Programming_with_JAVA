public class PolyArray {
    public static void main(String[] args) {
        Shape[] s = {
            new Rectangle(4, 5),
            new Circle(2)
        };

        for (Shape sh : s) {
            sh.display();
        }
    }

    private static class Shape {

        public Shape() {
        }

        private void display() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    private static class Rectangle extends Shape {

        public Rectangle(int i, int i0) {
        }
    }

    private static class Circle extends Shape {

        public Circle(int i) {
        }
    }
}
