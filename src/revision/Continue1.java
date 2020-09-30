package revision;

public class Continue1 {
    public static void main(String[] args) {
        for (int i = 21; i < 41; i++) {
            if (i == 30) {
                continue;
            }
            System.out.println(i);
        }
    }
}
