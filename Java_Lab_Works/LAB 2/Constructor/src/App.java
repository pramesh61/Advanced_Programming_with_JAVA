
import java.util.Scanner;

class App {

    int rank;
    String name;

    public void display() {

        System.out.println("Welcome "     + name +    "Your rank is" +   rank);

    }

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Enter your rank:");
        rank = scanner.nextInt();

    }

    public static void main(String[] args) {
        App a1 = new App();
        a1.input();
        a1.display();

    }
}