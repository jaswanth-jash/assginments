package strings;

public class EvenOdd {
    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2, 8, 9, 12, 15, 17, 22, 25, 36, 39};
        System.out.println("Total length of array " +a.length  );
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}
