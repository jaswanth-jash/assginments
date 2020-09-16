package chapter6;

public class Team1 {
    String teamName;
    int totalMembers;
    String strength;

    public static void main(String arg[]) {
        Team1 t = new Team1();
        t.teamName = "MyKlass Dev Team";
        t.totalMembers = 15;
        t.strength = "Developer";

        System.out.println(t.teamName);
        System.out.println(t.totalMembers);
        System.out.println(t.strength);
    }
}
