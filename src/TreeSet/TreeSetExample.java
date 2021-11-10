package TreeSet;

import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Java");
        set.add("PHP");
        set.add("Java");
        set.add("C++");
        set.add("JavaScript");
        set.add("C");
        System.out.println(set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        
        System.out.println("Traversing element through Iterator in descending order : ");
        itr = set.descendingIterator();
        while (itr.hasNext()) {
            System.out.println( itr.next());
        }
    }
}
