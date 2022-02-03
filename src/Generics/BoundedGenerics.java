package Generics;

public class BoundedGenerics {
    public static void main(String[] args) {

        Multiplicator<Integer> m = new Multiplicator<>(2,3);

        System.out.println(m.response());


    }

    static class Multiplicator<T extends Number > {
        private T base;
        private T times;

        public Multiplicator(T base, T times) {
            this.base = base;
            this.times = times;
        }

        public float response() {
            return this.base.floatValue() * this.times.floatValue();
        }
    }
}
