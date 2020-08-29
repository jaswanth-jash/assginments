package statementsloops;

public class Bank1 {
    public static void main(String args[]) {
        String bankName = "governamentbank";
        if (bankName.equals("governamentbank")) {
            System.out.println("SBI,Gramina bank,Sapthagiri bank these are governaments banks in know\n");
        } else if (bankName.equals("privatebank")) {
            System.out.println("Canara bank,HDFC bank,Paytm bank,ICICI bank these  are private banks in know\n");
        } else {
            System.out.println("Please select what type of bank u want ");
        }
    }
}
