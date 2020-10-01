package revision;

public class Break2 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 25) {
            System.out.println(i = i + 2);
            if (i == 11) {
                break;
            }
        }
    }
}
