package strings;

public class Ternary2 {
    public static void main(String args[]) {
        // variable declaration
        int a = 5, b = 10, max;
        System.out.println("First num: " + a);
        System.out.println("Second num: " + b);
        // Performing ternary operation
        max = (a > b) ? a : b;
        // Print the largest number
        System.out.println("Result = " + max);
    }
}
