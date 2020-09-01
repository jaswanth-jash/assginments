package datatypes;

public class Char5 {
    public static void main(String args[]) {
        //Here we print small letter of alphabets (a to z)
        for (int i = 97; i <= 122; i++) {
            System.out.println("The ASCII value of " + (char) i + " = " + i);
        }
    }
}
