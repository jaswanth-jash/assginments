package collections;

import java.util.*;

public class ArrayList2 {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();//Creating arraylist
        a.add("ayyappa");
        a.add("radha");
        a.add("vamsi");
        a.add("jashu");
        a.add(0, "jagan");
        a.remove(3);

        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
            a.get(1);
            a.indexOf("jashu");
            a.size();
            System.out.println(a);

    }
}
