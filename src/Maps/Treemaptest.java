package Maps;

import java.util.TreeMap;

public class Treemaptest {
    public static void main(String args[]){
        TreeMap<Integer,String> treeMap = new TreeMap<>();

        treeMap.put(3,"A");
        treeMap.put(34,"B");
        treeMap.put(1,"C");
        System.out.println(treeMap);
    }
}
