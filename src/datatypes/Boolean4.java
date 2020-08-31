package datatypes;

public class Boolean4 {
    public static void main(String args[]) {
        int num = 9;
        boolean flag = false;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
