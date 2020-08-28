package statementsloops;

public class Transactions {
    public static void main(String args[]) {
        System.out.println("Your bank transactions upto 1 Lakh rupees\n");
        int amount = 5000;
        int transaction;
        if (amount == 25000) {
            int maxAllowTxn = 3;
            for (transaction = 1; transaction <= 4; transaction++) {
                if (transaction <= maxAllowTxn) {
                    System.out.println("Per day transactions you have balance 75000 you done " + transaction + "st transaction\n");
                } else {
                    System.out.println("Your max transactions completed ");
                    break;
                }
            }
        } else if (amount == 10000) {
            int maxAllowTxn = 6;
            for (transaction = 1; transaction <= 10; transaction++) {
                if (transaction <= maxAllowTxn) {
                    System.out.println("Per day transactions you have balance 90000 you done " + transaction + "st transaction\n");
                } else {
                    System.out.println("Your max transactions completed  ");
                    break;
                }
            }
        } else if (amount == 50000) {
            int maxAllowTxn = 2;
            for (transaction = 1; transaction <= 4; transaction++) {
                if (transaction <= maxAllowTxn) {
                    System.out.println("Per day transactions you have balance 50000 you done " + transaction + "st transaction\n");
                } else {
                    System.out.println("Your max transactions completed ");
                    break;
                }
            }
        } else if (amount == 5000) {
            int maxAllowTxn = 8;
            for (transaction = 1; transaction <= 15; transaction++) {
                if (transaction <= maxAllowTxn) {
                    System.out.println("Per day transactions you have balance 95000 you done " + transaction + "st transaction\n");
                } else {
                    System.out.println("Your max transactions completed ");
                    break;
                }
            }
        } else if (amount == 20000) {
            int maxAllowTxn = 5;
            for (transaction = 1; transaction <= 4; transaction++) {
                if (transaction == 1) {
                    System.out.println("Per day transactions you have balance 80000 you done " + transaction + "st transaction\n");
                } else {
                    System.out.println("Your max transactions completed ");
                    break;
                }
            }
        } else if (amount == 30000) {
            int maxAllowTxn = 4;
            for (transaction = 1; transaction <= 6; transaction++) {
                if (transaction <= maxAllowTxn) {
                    System.out.println("Per day transactions you have balance 70000 you done " + transaction + "transaction\n");
                } else {
                    System.out.println("Your max transactions completed ");
                    break;
                }
            }
        } else {
            System.out.println("Please enter correct pin then u get cash ");
        }
    }
}
