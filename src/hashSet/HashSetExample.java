package hashSet;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
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
