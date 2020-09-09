package strings;

public class DoWhile1 {
    public static void main(String[] args) {
        String[] myTeam = {" Ayyappa ", " Radha ", " Rekha ", " Jaswanth ", " Sai ", " Lekha ", " Pravalika "};
        System.out.println("This is my Training team ");
        int j = 0;
        do {
            System.out.println(myTeam[j]);
            j++;
        }
        while (j < myTeam.length);
    }
}
