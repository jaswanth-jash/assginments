package collections;

import java.util.*;

public class ArrayList1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("jashu");//Adding object in arraylist
        list.add("sai");
        list.add("jay");
        list.add("yojith");
        list.add(null);
        list.add(2, "ayyappa");
        //list.add(10);
        System.out.println(list);
        //list.get(1);
        System.out.println(list.get(3));
        list.remove(1);
        list.add("sai");
        System.out.println(list);
       //list.size();
        System.out.println(list.size());
    }
}

