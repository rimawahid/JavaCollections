package hashSet;

import java.util.*;

class Person {

    String name, address;
    int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

}

public class HashSetObject {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Fahim", "Dhaka", 22);
        Person p2 = new Person("Tamim", "Pabna", 25);
        Person p3 = new Person("Samim", "Feni", 28);

        //adding Person to hashset
        set.add(p1);
        set.add(p2);
        set.add(p3);

//        for(Person person:set){
//            System.out.println(person.age + " "+ person.address+ " "+ person.age);
//        }
        Iterator<Person> itr = set.iterator();
        while (itr.hasNext()) {
            Person person = (Person) itr.next();
            System.out.println(person.name + " " + person.address + " " + person.age);
        }
    }

}
