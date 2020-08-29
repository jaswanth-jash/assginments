package statementsloops;

public class MoblieGames {
    public static void main(String args[]) {
        System.out.println("Now i am printing top moblie games in india\n");
        for (int rank = 1; rank <= 5; rank++) {
            if (rank == 1) {
                System.out.println("In India top playing moblie game is PUBG\n");
            } else if (rank == 2) {
                System.out.println("In India top 2nd playing game is Freefire\n");
            } else if (rank == 3) {
                System.out.println("In India top 3rd playing moblie game is Clashofclans\n");
            } else if (rank == 4) {
                System.out.println("In India top 4th playing moblie game is Candycursh\n");
            } else if (rank == 5) {
                System.out.println("In India top 5th playing moblie game is 8Ballpool\n");
            } else {
                System.out.println("Other games are playing less paririty in india");
            }
        }
    }
}
