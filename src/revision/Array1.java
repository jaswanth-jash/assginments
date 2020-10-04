package revision;

public class Array1 {
    public static void main(String[] args) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number : numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // convert the average from int to double
        average = ((double) sum / (int) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
