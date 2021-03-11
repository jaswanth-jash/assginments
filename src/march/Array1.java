package march;

public class Array1 {
    public static void main(String[] args) {

        //Initialize array
        int[] a = {1,2,2,3,4,4,5,5,6,7,7};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.println(a[j]);
            }
        }
    }
}
