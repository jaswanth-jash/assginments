package training;

public class Calculator1 {
    public static void main(String args[]) {
        String name = "addition";
        int add, sub, mul, div, mod;
        int a = 23;
        int b = 15;
        String[] operations = {"addition", "substraction", "multipication", "division", "modulo"};
        if (name.equals("addition")) {
            add = a + b;
            System.out.println("Addition :" + add);
        } else if (name.equals("substraction")) {
            sub = a - b;
            System.out.println("substraction :" + sub);
        }  else if (name.equals("multipication")) {
            mul = a * b;
            System.out.println("multipication :" + mul);
        } else if (name.equals("division")) {
            div = a / b;
            System.out.println("division :" + div);
        } else if (name.equals("modulo")) {
            mod = a - b;
            System.out.println("modulo :" + mod);
        } else {
            System.out.println("operation is not their");
        }
    }
}
