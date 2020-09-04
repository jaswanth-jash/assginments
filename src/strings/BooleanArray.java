package strings;

public class BooleanArray {
    public static void main(String[] args) {
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        boolean[][] array = {{true, false, true}, {false, true, false}};
        int rows_length = array.length;
        int columns_length = array[0].length;

        for (int i = 0; i < rows_length; i++) {
            for (int j = 0; j < columns_length; j++) {
                if (array[i][j]) {
                    System.out.print(" t ");
                } else {
                    System.out.print(" f ");
                }

            }
            System.out.println();
        }
    }
}
