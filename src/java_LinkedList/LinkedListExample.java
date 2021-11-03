package java_LinkedList;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
