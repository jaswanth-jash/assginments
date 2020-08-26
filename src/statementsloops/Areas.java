package statementsloops;

public class Areas {
    public static void main(String args[]) {
        System.out.println("We are going to Bangalore for searching job\n");
        int area = 1;
        for (area = 1; area <= 5; area++) {
            if (area == 1) {
                System.out.println("Bagmane Tech Park it is located in Mahadevapura\n");
            } else if (area == 2) {
                System.out.println("Ecospace it is located in bellandur\n");
            } else if (area == 3) {
                System.out.println("Electronic city phase 1 and Electronic city phase 2 both are located near bommanahali\n");
            } else if (area == 4) {
                System.out.println("Manyata tech park located in white field\n");
            } else if (area == 5) {
                System.out.println("CV Raman nagar located in Indiranagar\n");
            } else {
                System.out.println("You are selected tech park are not located in bangalore\n");
            }
        }
    }
}
