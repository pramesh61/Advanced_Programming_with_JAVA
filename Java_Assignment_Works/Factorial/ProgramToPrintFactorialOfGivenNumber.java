// 1. Write a program to calculate the factorial of a given number using a for loop.

// 5! = 1*2*3*4*5
public class ProgramToPrintFactorialOfGivenNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
