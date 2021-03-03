package march;

public class Method3 {
    public int addNumbers(int a, int b) {
        int mul = a - b;
        // return value
        return mul;
    }

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        // create an object of Main
        Method3 obj = new Method3();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sub is: " + result);
    }
}
