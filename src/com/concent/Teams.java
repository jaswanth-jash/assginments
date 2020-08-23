package com.concent;

public class Teams {
    public static void main(String args[]) {
        int selectTeam = 5;
        String[] teams = {" MI ", " CSK ", " RCB ", " PUNJAB ", " RR ", " SRH ", " DC ", " KKR "};
        // here we find total teams
        System.out.println("Total no of ipl teams: " + teams.length);
        System.out.println("Here are the list of IPL teams: ");
        for (int team = 0; team < teams.length; team++) {
            //here we print teams wise
            System.out.println(teams[team]);
        }
        System.out.println(" Choosen  team: " + teams[selectTeam]);
    }
}

