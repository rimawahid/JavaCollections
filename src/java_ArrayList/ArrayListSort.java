package java_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Samim");
        list1.add("Tamim");
        list1.add("Ramim");
        list1.add("Jamil");
        //Sorting the list
        Collections.sort(list1);

        for (String name : list1) {
            System.out.println(name);
        }
        
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(11);
        list2.add(51);
        list2.add(19);
        list2.add(22);
        list2.add(2);
        //Sorting the list
        Collections.sort(list2);

        for (Integer number : list2) {
            System.out.println(number);
        }

    }
}
