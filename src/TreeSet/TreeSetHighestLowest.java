
package TreeSet;
import java.util.*;
public class TreeSetHighestLowest {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15); 
         System.out.println(set);
         System.out.println("Lowest value : " + set.pollFirst());
         System.out.println("Highest value : " + set.pollLast());
         System.out.println("floor :"+ set.floor(22));
         System.out.println("ceiling :"+ set.ceiling(22));
         System.out.println("New tree set :"+ set);
    }
}
