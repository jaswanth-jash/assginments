package training;

public class MyArray2 {
    public static void main(String[] args)
    {

        int arr [][][] = { {4, 1, 2}, {  7, 5, 3 }, { 8, 9, 6} };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++)
                System.out.print(arr[i][j][k] + " ");
            }

            System.out.println();
        }
    }
}
