public class DowncastingTest {
    public static void main(String[] args) {
        A obj = new B();
        B obj2 = (B) obj; // Downcasting
        obj2.show();
    }
}
