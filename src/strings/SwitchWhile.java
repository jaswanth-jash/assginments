package strings;

public class SwitchWhile {
    public static void main(String args[]) {
        String[] weeks = {" Sunday ", " Monday ", " Tuesday ", " Wednesday ", " Thursday ", " Friday ", " Saturday "};
        int j =0;
        while (j <= weeks.length) {
            //++j;
            switch (j) {
                case 0:
                    System.out.println("1st day :" + weeks[j]);
                    break;
                case 1:
                    System.out.println("2nd day :" + weeks[j]);
                    break;
                case 2:
                    System.out.println("3rd day :" + weeks[j]);
                    break;
                case 3:
                    System.out.println("4th day :" + weeks[j]);
                    break;
                case 4:
                    System.out.println("5th day :" + weeks[j]);
                    break;
                case 5:
                    System.out.println("6th day :" + weeks[j]);
                    break;
                case 6:
                    System.out.println("7th day :" + weeks[j]);
                    break;
            }
            j++;
        }
    }
}
