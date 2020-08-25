package statementsloops;

public class Tirumula {
    public static void main(String args[]) {
        System.out.println("Instructions to ticket booking for darshanam  ");
        String rules = "old";
        int age;
        if (rules.equals("old")) {
            for (age = 65; age <= 70; age++) {
                if (age == 68) {
                    System.out.println("Your age is to old because of corona we are not allowed for ticket booking " + age);
                }
            }
        } else if (rules.equals("young")) {
            for (age = 15; age <= 64; age++) {
                if (age == 40) {
                    System.out.println("Your age is selcet for ticking booking " + age);
                }
            }
        } else if (rules.equals("child")) {
            for (age = 1; age <= 14; age++) {
                if (age == 11) {
                    System.out.println("Your age is to child because we are not allowed  " + age);
                }
            }
        } else {
            System.out.println("Pregent ladies also not allowed for darshanam");
        }
    }
}
