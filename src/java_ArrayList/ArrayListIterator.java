package java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Samim");
        list.add("Tamim");
        list.add("Ramim");
        list.add("Jamil");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

////using for-each loop
//        for (String Name : list) {
//            System.out.println(Name);
//        }
    }
}
