package chapter6;

public class Team2 {
    String teamName;
    int totalTeams;
    String bestTeam;

    public static void main(String arg[]) {
        Team2 t = new Team2();
        t.teamName = "IPL Team";
        t.totalTeams = 8;
        t.bestTeam = "Mumbai Indians";

        System.out.println(t.teamName);
        System.out.println(t.totalTeams);
        System.out.println(t.bestTeam);
    }
}
