package java_ArrayList;

import java.util.ArrayList;

public class ArrayListGetAndSet {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Samim");
        list.add("Tamim");
        list.add("Ramim");
        list.add("Jamil");

        //accessing the element  
        System.out.println("Returning element: " + list.get(0));
        
        //changing the element  
        list.set(0, "Rahim");
        
        for (String name:list) {
            System.out.println(name);
        }
    }
}
