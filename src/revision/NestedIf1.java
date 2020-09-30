package revision;

public class NestedIf1 {
    public static void main(String[] args) {

        // declaring double type variables
        Double n1 = -1.0;
        double n2 = 4.5;
        double n3 = -5.3;
        double largestNumber;

        // checks if n1 is greater than or equal to n2
        if (n1 >= n2) {

            // checks if n1 is greater than or equal to n3
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            // checks if n2 is greater than or equal to n3
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("The largest number is " + largestNumber);
    }
}
