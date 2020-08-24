package statementsloops;

public class ConcentDetails {
    public static void main(String args[]) {
        String position = "Developers";
        if (position.equals("Managers")) {
            System.out.println("Jagan Dhanajay Radha those are team managers.");
        } else if (position.equals("Developers")) {
            System.out.println("Venkat Ayyappa Yaspal Gopi Jaga those are developers in company. ");
        } else if (position.equals("Testing")) {
            System.out.println("Usha ,now she is a testing team in company.");
        } else if (position.equals("Freshers")) {
            System.out.println("Jaswanth Rekha Lekha Pravalika Sai those are fresher in company. ");
        } else {
            System.out.println("Abin Hemanth those are UI design in company.");
        }
    }
}
