package strings;

public class Colleges {
    public static void main(String args[]) {
        String state = "Tamilnadu", city = "maduri";
        boolean flag = true;
        if (flag) {
            for (int i = 0; i <= city.length(); i++) {
                if (state.equals("tamilnadu")) {
                    if (city.equals("chennai")) {
                        System.out.println("This is famous for  engineering colleges ");
                        break;
                    }
                    if (city.equals("combaturu")) {
                        System.out.println("Here mostly MBA colleges present ");
                        break;
                    }
                    if (city.equals("maduri")) {
                        System.out.println("Here school are famous");
                        break;
                    } else {
                        System.out.println("please select city");
                        break;
                    }
                } else if (state.equals("andrapradesh")) {
                    // for (int i = 0; i <= city.length(); i++) {
                    if (city.equals("vijayawada")) {
                        System.out.println("This is famous for engineering colleges ");
                        break;
                    } else if (city.equals("tirupathi")) {
                        System.out.println("Here mostly MBA colleges present ");
                        break;
                    } else if (city.equals("nellore")) {
                        System.out.println("Here intermidate colleges are famous");
                        break;
                    } else {
                        System.out.println("please select city");
                        break;
                    }
                    // }
                } else if (state.equals("mahasrathra")) {
                    // for (int i = 0; i <= city.length(); i++) {
                    if (city.equals("mumbai")) {
                        System.out.println("This is famous for  IIT mumbai engineering colleges ");
                        break;
                    } else if (city.equals("pune")) {
                        System.out.println("Here mostly degree colleges present ");
                        break;
                    } else if (city.equals("nagpur")) {
                        System.out.println("Here school are famous");
                        break;
                    } else {
                        System.out.println("please select city");
                        break;
                    }
                    //  }
                } else {
                    System.out.println("please select state");
                }
            }
        }
    }
}
