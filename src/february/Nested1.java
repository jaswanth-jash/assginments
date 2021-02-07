package february;

public class Nested1 {
    public static void main(String[] args) {
        int age = 12;
        int weight = 44;
        //applying condition on age and weight
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("u r not eligible for blood donate");
            }
        }
    }
}
