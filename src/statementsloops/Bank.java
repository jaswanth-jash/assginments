package statementsloops;

public class Bank {
    public static void main(String args[]) {
        System.out.println("Welcome to the IndianBank\n");
        System.out.println("Instruction for applying a account\n");
        for (int age = 1; age <= 60; age++) {
            age = 14;
            if (age == 25) {
                System.out.println("You selected ,Now u apply a bank account " + age);
                break;
            } else if (age == 14) {
                System.out.println("You are not selected for open a bank account " + age);
                break;
            } else {
                System.out.println("First u enter u r name then u enter u details ");
            }
        }
    }
}
