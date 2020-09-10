package strings;

public class Break1 {
    public static void main(String args[]) {
        /*
        The break statement used in an earlier chapter of this tutorial.
        It was used to "jump out" of a switch statement.

         The break statement can also be used to jump out of a loop.
         */
        for (int j = 0; j < 10; j++) {
            //This example jumps out of the loop when i is equal to 5
            if (j == 5) {
                break;
            }
            System.out.println(j);
        }
    }
}
