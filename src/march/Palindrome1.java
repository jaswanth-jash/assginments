package march;

public class Palindrome1 {
    public static void main(String[] args) {
        String s = "MAM" ;
        s = s.trim();
        String res = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        if (res.equals(s))

            System.out.print("palindrome");

        else
            System.out.print("Not palindrome");

    }
}
