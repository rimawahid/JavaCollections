package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class GetAndSetList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        //accessing the element   
        System.out.println("Returning elentent :" + list.get(1));

        //changing the element  
        list.set(1, "Javascript");
        
        //Iterating the List element using for-each loop  
        for (String course : list) {
            System.out.println(course);
        }

    }
}
