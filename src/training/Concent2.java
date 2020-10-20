package training;

public class Concent2 {
    public static void main(String[] args) {
        String empname = "jaswanth";
        String[] names = {"ayyappa", "radha", "venkat", "vamsi", "jaswanth", "rekha"};
        String[] designation = {"senior java developer", "scrum master", "team lead", "java developer", "trainee", "trainee"};
        int[] salary = {35000, 45000, 50000, 30000, 5000, 5000};

      //  for (int i = 0; i <= names.length-1; i++) {
            if (names.equals("jaswanth")) {
                System.out.println("name :" + names + "\n" + "designation :" + designation + "\n" + "salary : " + salary + "\n");
            }
            else {
                System.out.println("Please select correct name");
            }
        }
    }

