package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {
    public static void main(String args[]) {
        ArrayList<String> jj = new ArrayList<String>();
        jj.add(0, "jaswanth");
        jj.add("pooja");
        jj.add("nikitha");
        jj.add(3, "pavithra");
        jj.add("raskith");
        jj.set(4, "raskith");
        jj.remove(4);
        Iterator itr = jj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
