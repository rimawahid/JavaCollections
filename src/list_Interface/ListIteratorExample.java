package list_Interface;

import java.util.*;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");

        ListIterator<String> itr = list.listIterator();
        System.out.println("Traversing elements in forward direction");
        while (itr.hasNext()) {
            System.out.println("index :" + itr.nextIndex() + " value " + itr.next());
        }
        
         System.out.println("Traversing elements in backward direction");    
         while (itr.hasPrevious()) {
            System.out.println("index :" + itr.nextIndex() + " value " + itr.previous());
        }
    }
}
