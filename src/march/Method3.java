package march;

public class Method3 {
    public int addNumbers(int a, int b) {
        int sub = a - b;
        // return value
        return sub;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        // create an object of Main
        Method3 obj = new Method3();
        // calling method
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sub is: " + result);
    }
}
