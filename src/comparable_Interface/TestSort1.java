package comparable_Interface;

import java.util.*;

public class TestSort1 {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(102, "Ajoy", 25));
        al.add(new Student(103, "Jay", 27));

        Collections.sort(al);

//        for (Student st : al) {
//            System.out.println(st.age + " " + st.name + "  " + st.rollno);
//        }
        Iterator<Student> iterator = al.iterator();
        while (iterator.hasNext()) {
            Student st = (Student)iterator.next();
            System.out.println(st.age + " " + st.name + " "+ st.rollno);
        }
    }
}
