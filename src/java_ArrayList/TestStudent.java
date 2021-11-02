package java_ArrayList;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Raisa", 23);
        Student s2 = new Student(102, "Rahnuma", 25);
        Student s3 = new Student(103, "Subhana", 27);

        ArrayList<Student> list;
        list = new ArrayList<>();
        list.add(s3);
        list.add(s2);
        list.add(s1);

        list.forEach((studentInfo) -> {
            System.out.println(studentInfo.id + " " + studentInfo.name + " " + studentInfo.roll);
        });
    }
}
