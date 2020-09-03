package strings;

public class BooleanString {
    public static void main(String args[]) {
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
        //similar group lo elements
        String[][] array = {{"Jaswanth", "Rekha", "Lekha", "Sai", "Pravalika"}, {"Ayyappa", "Radha"}};
        boolean flag = true;
        if (flag = true) {
            for (int i = 0; i <= array[0].length; i++) {
                System.out.println("Total number of fresher :" + array[0].length);
                break;
            }
        }
        if (flag = true) {
            for (int i = 0; i <= array[1].length; i++) {
                System.out.println("Total number of staff :" + array[1].length);
                break;
            }
        }
        else {
            System.out.println("Please select boolean value");
        }
    }
}
