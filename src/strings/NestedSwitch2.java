package strings;

public class NestedSwitch2 {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0:
                        switch (j) {
                            case 0:
                                System.out.println("here  i = 0,j=0;");
                                break;
                            case 1:
                                System.out.println("here i=0;j=1");
                                break;
                            case 2:
                                System.out.println("here i=0;j=2");
                                break;
                            default:
                                System.out.println("nested default case!!\n");
                        }
                        break;
                    case 1:
                        switch (j) {
                            case 0:
                                System.out.println("here i=1,j=0");
                                break;
                            case 1:
                                System.out.println("here i=1;j=1");
                                break;
                            case 2:
                                System.out.println("here i=1;j=2");
                                break;
                            default:
                                System.out.println("nested default case!!\n");
                        }
                        break;
                    default:
                        System.out.println("No matching case found!!");
                }
            }
        }
    }
}
