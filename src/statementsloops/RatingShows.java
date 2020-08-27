package statementsloops;

public class RatingShows {
    public static void main(String args[]) {
        System.out.println("Rating of news channel in india\n");
        String showName = "iNews";
        int rating;
        if (showName.equals("tv9")) {
            for (rating = 1; rating <= 5; rating++) {
                if (rating == 5) {
                    System.out.println(" tv9 channel rating :" + rating);
                }
            }
        } else if (showName.equals("etv")) {
            for (rating = 1; rating <= 5; rating++) {
                if (rating == 4) {
                    System.out.println("etv channel rating :" + rating);
                }
            }
        } else if (showName.equals("ABN")) {
            for (rating = 1; rating <= 5; rating++) {
                if (rating == 3) {
                    System.out.println("ABN channel rating :" + rating);
                }
            }
        } else if (showName.equals("sakshi")) {
            for (rating = 1; rating <= 5; rating++) {
                if (rating == 2) ;
                {
                    System.out.println("Sakshi channel rating : " + rating);
                }
            }
        } else {
            System.out.println(showName + " channel rating below 2");
        }
    }
}
