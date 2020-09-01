package datatypes;

public class Celsius {
    public static void main(String args[]) {
        /* f =(9c +(32*5))/5          [f= fahrenheit]
        f*5 = 9c + (32*5)
        5f =9c +160
        5(f-32)=9c
        c = 5*(f-32)/9      [c= celsius]
         */
        System.out.println("enter a degree in Fahrenheit:\n ");
        double fa = 222;
        double celsius = ((5 * (fa - 32.0)) / 9.0);
        System.out.println(fa + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
