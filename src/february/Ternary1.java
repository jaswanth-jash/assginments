package february;

public class Ternary1 {
    public static void main(String[] args) {
        int number = 22;
        //Using ternary operator
        String value = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(value);
    }
}
