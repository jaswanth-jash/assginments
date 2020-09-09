package strings;

public class Switch {
    public static void main(String args[]) {
        String[] myKlas = {" Jaga ", " Radha ", " Venkat ", " Ayyappa ", " Yaspal ", " Gopi ", " Uma ", " Jaswanth ", " Rekha"};
        int i=0;
        //switch statement to select one of many code blocks to be executed.
       // for (i = 0; i <= myKlas.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("He is a project manager: " + myKlas[i]);
                    break;
                case 1:
                    System.out.println("He is a  manager: " + myKlas[i]);
                    break;
                case 2:
                    System.out.println("He is a Senior java developer: " + myKlas[i]);
                    break;
                case 3:
                    System.out.println("He is a  Senior java developer: " + myKlas[i]);
                    break;
                case 4:
                    System.out.println("He is a java developer: " + myKlas[i]);
                    break;
                case 5:
                    System.out.println("He is a aslo a java developer: " + myKlas[i]);
                    break;
                case 6:
                    System.out.println("She is a testing team: " + myKlas[i]);
                    break;
                case 7:
                    System.out.println("He is a fresher: " + myKlas[i]);
                    break;
                case 8:
                    System.out.println("She is a fresher: " + myKlas[i]);
                    break;
            }
        }
    }
//}
