package strings;

public class BooleanString {
    public static void main(String args[]) {
        String[] student = {"Jaswanth", "Rekha", "Lekha", "Sai", "Pravalika"};  //similar group lo elements
        String[] staff = {"Ayyappa", "Radha"};
        boolean flag = true;
        if (flag = true) {
            for (int i = 0; i <= student.length; i++) {
                System.out.println("Total number of fresher :" + student.length);
                break;
            }
        } else {
            for (int i = 0; i <= staff.length; i++) {
                System.out.println("Total number of staff :" + staff.length);
                break;
            }
        }
    }
}
