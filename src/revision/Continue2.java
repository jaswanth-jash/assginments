package revision;

public class Continue2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 50) {
            if (i == 24) {
                continue;

            }
            System.out.println(i = i + 2);
            //i++;
        }
    }
}
