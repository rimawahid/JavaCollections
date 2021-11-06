package list_Interface;

import java.util.*;

public class SortList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        //Sorting the list
        Collections.sort(list);
        System.out.println("Printing List : " + list);

        //using  iterator
        System.out.println("Sorting ...");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
