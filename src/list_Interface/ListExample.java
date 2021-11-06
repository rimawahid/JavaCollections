package list_Interface;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        //creating a list
        List<String> list = new ArrayList<>();
        //adding elements in the list

        list.add("vijoy");
        list.add("Ajoy");
        list.add("Joy");
        
        System.out.println(list);
        //Iterating the List element using for-each loop  
//        for (String name : list) {
//            System.out.println(name);
//        }
        
        //using  iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
