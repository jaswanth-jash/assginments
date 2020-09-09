package strings;

public class LogicalAge {
    public static void main(String[] args) {
        int age = 14;
        if (age > 1 && age < 18) {
            System.out.println("You are not eligible for apply for  bank account :"+age);
        } else if (age > 18 || age < 60) {
            System.out.println("You are eligible for apply for bank account "+age);
        } else {
            System.out.println("First you select u r age "+age);
        }
    }
}
