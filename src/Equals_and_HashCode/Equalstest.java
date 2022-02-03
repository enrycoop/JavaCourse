package Equals_and_HashCode;

import java.util.ArrayList;
import java.util.Collections;

public class Equalstest {
    public static void main(String args[]){
        Student s1 = new Student(1, "Jhon", 21, "Address");
        Student s2 = new Student(1, "Jhon", 21, "Address");
        Student s3 = new Student(1, "Nick", 25, "Address34");
        ComparableStudent s4 = new ComparableStudent(5, "Nick", 25, "Address34");
        ComparableStudent s5 = new ComparableStudent(0, "Nick", 25, "Address34");
        ComparableStudent s6 = new ComparableStudent(18, "Nick", 25, "Address34");
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        ArrayList<ComparableStudent> list = new ArrayList<>(3);

        list.add(s4);
        list.add(s5);
        list.add(s6);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


       
    }
    
}
