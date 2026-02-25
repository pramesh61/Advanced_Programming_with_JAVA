// 2. Write a loop to reverse a string.

public class ReverseString {
    public static void main(String [] args) {
        String Str = "pramesh";
        String reverseStr = " ";
        char ch;

        for (int i=0; i<Str.length (); i++) {
            ch = Str.charAt (i);
            reverseStr = ch + reverseStr;
        }

        System.out.println("Reversed String is: " + reverseStr);

    }
    
}
