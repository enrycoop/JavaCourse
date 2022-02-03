package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String args[]){
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        System.out.println(hashSet.add("C"));
        System.out.println(hashSet.add("A"));

        System.out.println(hashSet);

        hashSet.remove("B");

        System.out.println(hashSet);

        for (String item : hashSet){
            System.out.println(item);
        }
    }
}
