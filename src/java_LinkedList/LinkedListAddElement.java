package java_LinkedList;

import java.util.LinkedList;

public class LinkedListAddElement {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Initial list of elements: " + list);
        list.add("Dhaka");
        list.add("Narayanganj");
        list.add("Munshiganj");
        System.out.println("After invoking add member: " + list);

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Manikganj");
        list1.add("Feni");

        //adding second list of the first list
        list.addAll(list1);
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Pabna");
        list2.add("Natore");

        //Adding second list elements to the first list at specific position  
        list.addAll(2, list2);
        System.out.println(list);

        //Adding an element at the first position 
        list.addFirst("Fatulla");

        //Adding an element at the last position 
        list.addLast("Chittagong");
        System.out.println(list);
    }
}
