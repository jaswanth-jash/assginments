package statementsloops;

public class Transactions {
    public static void main(String args[]) {
        System.out.println("Your bank transactions upto 1 Lakh rupees\n");
        int amount = 25000;
        int transaction;
        if (amount == 25000) {
            for (transaction = 1; transaction <= 4; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 75000 you done " + transaction + "st transaction");
                }
            }
        } else if (amount == 10000) {
            for (transaction = 1; transaction <= 10; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 90000 you done " + transaction + "st transaction");
                }
            }
        } else if (amount == 50000) {
            for (transaction = 1; transaction <= 4; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 50000 you done " + transaction + "st transaction");
                }
            }
        } else if (amount == 5000) {
            for (transaction = 1; transaction <= 15; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 95000 you done " + transaction + "st transaction");
                }
            }
        } else if (amount == 20000) {
            for (transaction = 1; transaction <= 4; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 80000 you done " + transaction + "st transaction");
                }
            }
        } else if (amount == 30000) {
            for (transaction = 1; transaction <= 6; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 70000 you done " + transaction + "transaction");
                }
            }
        } else {
            System.out.println("Please enter correct pin then u get cash ");
        }
    }
}
