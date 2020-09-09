package strings;

public class Continue2 {
    public static void main (String args[]) {
        String[] name = {"Ayyappa", "Radha", "Rekha", "Jaswanth", "Pravalika", "Lekha", "Sai"};
        int i;
        for (i = 0; i <= 7; i++) {
            //here skip particular string
            if (i == 4) {
                continue;
            }
            System.out.println(name[i]);
        }
    }
}
