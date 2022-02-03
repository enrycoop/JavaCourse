package Generics;

import java.util.Map;

public class MethodGenerics {

    public static <K,V> boolean entryCompare(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Pair<String,String> p1 = new Pair<>("k1", "v1");
        Pair<String,String> p2 = new Pair<>("k1", "v1");

        System.out.println(entryCompare(p1,p2));
    }

    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
