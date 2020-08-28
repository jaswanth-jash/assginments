package statementsloops;

public class Laptops {
    public static void main(String args[]) {
        System.out.println("Now i am printing  top laptops orderwise\n");
        for (int rank = 1; rank <= 5; rank++) {
            if (rank == 1) {
                System.out.println("Now Apple is trended in world ");
            } else if (rank == 2) {
                System.out.println("In " + rank + "nd place Dell laptops");
            } else if (rank == 3) {
                System.out.println("In " + rank + "rd place HP laptops");
            } else if (rank == 4) {
                System.out.println("In " + rank + "th place Sony laptops");
            } else if (rank == 5) {
                System.out.println("In " + rank + "th place Lenova laptops");
            } else {
                System.out.println("In company they gave Thinkpad laptops");
            }
        }
    }
}
