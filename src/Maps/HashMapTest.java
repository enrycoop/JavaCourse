package Maps;

import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();

        map.put("a",10);
        map.put("b",20);
        map.put("c",30);

        System.out.println(map);

        if(map.containsKey("a")){
            System.out.println(map.get("a"));
        }

        for (String key : map.keySet()){
            System.out.println("key: " + key + ", value: "+ map.get(key));
        }

        for (Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry);
            System.out.println("key: " + entry.getKey()+ ", value: "+ entry.getValue());
        }
    }
}
