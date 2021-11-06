package list_Interface;

import java.util.*;

class Student {

    int id;
    String name, address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

}

public class ListExampleObject {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        //creating list of books
        Student s1 = new Student(101, "Ahad", "Dhaka");
        Student s2 = new Student(102, "Fahad", "Narayanganj");
        Student s3 = new Student(103, "Omar", "Narayanganj");
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        for (Student stList : list) {
//            System.out.println(stList.id + " " + stList.name + " " + stList.address);
//        }

        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            Student st = (Student)itr.next();
            System.out.println(st.id + " " + st.name + " " + st.address);
        }
        System.out.println("");
    }
}
