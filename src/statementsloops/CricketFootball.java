package statementsloops;

public class CricketFootball {
    public static void main(String args[]) {
        System.out.println("Now i am printing who they are playing cricket and football\n ");
        String name = "cricket";
        if (name.equals("cricket")) {
            System.out.println("India, AUS,SA,NZ,WI,AFG,PAK,SL,England these country are playing cricket ");
        } else if (name.equals("football")) {
            System.out.println("Europe country are playing football");
        } else {
            System.out.println("Please select one sports name we will find");
        }
    }
}
