
package linkedHashSet;


import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
         LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("PHP");
        set.add("JavaScript");
        set.add("C");
        System.out.println(set);
        
        Iterator<String> itr = set.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
