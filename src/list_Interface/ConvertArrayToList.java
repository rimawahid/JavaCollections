package list_Interface;

import java.util.*;

public class ConvertArrayToList {

    public static void main(String[] args) {
        //Creating Array
        String[] array = {"Java", "PHP", "C#", "C++"};
        System.out.println("Printing Array : " + Arrays.toString(array));

        //Converting Array to list
        List<String> list = new ArrayList<>();
        for (String lang : array) {
            list.add(lang);

        }
        System.out.println("Priting List :" + list);

    }
}
