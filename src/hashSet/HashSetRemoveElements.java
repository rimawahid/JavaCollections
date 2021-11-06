package hashSet;

import java.util.*;

public class HashSetRemoveElements {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("PHP");
        set.add("Java");
        set.add("JavaScript");
        set.add("C");
        //ignoring duplicate element
        set.add("Java");
        System.out.println("An initial list of elements: " + set);

        //Removing specific element from HashSet 
        set.remove("PHP");
        System.out.println("After invoking remove(object) method: " + set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ruby");
        set1.add("Python");
        set1.add("C++");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        //Removing all the new elements from HashSet  
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);

        //Removing elements on the basis of specified condition  
        set.removeIf(str -> str.contains("C"));
        System.out.println("After invoking removeIf() method: " + set);;
        //Removing all the elements available in the set  
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }
}
