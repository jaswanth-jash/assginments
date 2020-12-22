package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6 {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();//Creating arraylist
        a.add("jashu");
        a.add("mahesh");
        a.add("sai");
        a.add("rishi");
        a.add(0, "gowtham");
        a.remove(3);
        a.add(4,"ajith");
        a.set(3,"charan");
        a.add(5,"haneesh");

        Iterator itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
