package statementsloops;

public class SelectOneArea {
    public static void main(String args[]) {
        System.out.println("I selected Electronic city phase 1\n");
        int block = 1;
        if (block == 1) {
            System.out.println("Infosys present in block 1");
        } else if (block == 2) {
            System.out.println("Bosch present in block 2");
        } else if (block == 3) {
            System.out.println("Wipro present in block 3");
        } else if (block == 4) {
            System.out.println("CTS present in block 4");
        } else if (block == 5) {
            System.out.println("HCL present in block 5");
        } else if (block == 6) {
            System.out.println("CGI present in block 6");
        } else {
            System.out.println("You are not selected coreect block please select correct block number");
        }
    }
}
