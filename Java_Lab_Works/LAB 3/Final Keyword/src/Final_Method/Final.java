final class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}



public class Final {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 20));
    }
}
