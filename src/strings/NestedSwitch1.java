package strings;

public class NestedSwitch1 {
    public static void main(String args[]) {
        int i = 0;
        int j = 1;
        switch (i) {
            case 0:
                switch (j) {
                    case 0:
                        System.out.println("here we print i = 0,j=0;");
                        break;
                    case 1:
                        System.out.println("here i=0;j=1");
                        break;
                    default:
                        System.out.println("nested default case!!");
                }
                break;
            default:
                System.out.println("No matching case found!!");
        }
    }
}

