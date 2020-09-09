package strings;

public class Logical4 {
    public static void main(String[] args) {
        int age = 14;
        if (age > 1 && age < 18) {
            System.out.println("you are miner :" +age);
        } else if (age > 18 || age < 60) {
            System.out.println(" Here both young and old people :"+age);
        } else {
            System.out.println("You are too old  "+ age);
        }
    }
}
