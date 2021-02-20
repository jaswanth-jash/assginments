package february;

public class Factorial1 {
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1;
//        while (i <= num) {
//            factorial *= i;
//            i++;
//        }
//        System.out.printf("Factorial of %d = %d", num, factorial);
        for (int i =1;i<=num;i++){
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
