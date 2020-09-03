package strings;

public class Logical1 {
    public static void main(String[] args) {
        float number1 = 120.345f;
        float number2 = 345.21f;
        float number3 = 234.21f;
        if (number1 < number2 && number1 < number3) {
            System.out.println("Smallest Number is number1");
        }
        if (number2 > number3 || number3 > number1) {
            System.out.println("Number2 greater than number3 is greater than number1");
        }
    }
}
