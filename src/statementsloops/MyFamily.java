package statementsloops;

public class MyFamily {
    public static void main(String args[]) {
        String name = "subhashini";
        int age;
        if (name.equals("govardhan")) {
            for (age = 45; age <= 50; age++) {
                if (age == 50) {
                    System.out.println("His name is Govardhan.He is my father ,his age is: " + age);
                }
            }
        } else if (name.equals("subhashini")) {
            for (age = 42; age <= 46; age++) {
                if (age == 45) {
                    System.out.println("Her name is Subhashini. she is my mother,her age is: " + age);
                }
            }
        } else if (name.equals("jaswanth")) {
            for (age = 21; age <= 23; age++) {
                if (age == 23) {
                    System.out.println("His name is Jaswanth. That's me,my age is: " + age);
                }
            }
        } else {
            System.out.println("His name is SaiKumar .He is my brother,his age is:20 ");
        }
    }
}
