package revision;

public class Break1 {
    public static void main(String[] args) {
        for (int i = 11; i < 20; i++) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }
    }
}
