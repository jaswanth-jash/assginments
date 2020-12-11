package collections;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("govardhan");
        al.add("subhashini");
        al.add(2, "jashu");
        al.add("sai");
        System.out.println(al);
        al.set(2, "jay");
        al.remove(3);
        al.add(3, "java");
        al.add("angular");
        al.remove(4);
        System.out.println(al);
        System.out.println(al.size());
    }
}
