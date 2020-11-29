package collections;

import java.util.*;

public class ArrayList3 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();//Creating arraylist
        al.add("yojith");
        al.add("jay");
        al.add("preetham");
        al.add(3, "jashu");
        al.set(2, "siddu");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}