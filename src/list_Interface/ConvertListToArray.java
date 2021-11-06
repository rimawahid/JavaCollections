package list_Interface;

import java.util.*;

public class ConvertListToArray {

    public static void main(String[] args) {
        //Creating List
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        System.out.println("Printing List : ");

        //Converting  list to Array 
        //System.out.println(list.size());
        //System.out.println(new String[list.size()]);
        String[] array = list.toArray(new String[list.size()]);
        //System.out.println(array);
        System.out.println("Printing Array : " + Arrays.toString(array));
    }
}
