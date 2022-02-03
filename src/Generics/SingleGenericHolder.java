package Generics;

public class SingleGenericHolder<T> { // Posso specificare il tipo in fase di creazione
    private T obj;

    SingleGenericHolder(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

    public void setObj(T obj){
        this.obj = obj;
    }


    public static void main(String args[]){
        SingleGenericHolder<Integer> iObj = new SingleGenericHolder<>(10);
        System.out.println(iObj.getObj());
        SingleGenericHolder<String> sObj = new SingleGenericHolder<>("String!!");
        System.out.println(sObj.getObj());
    }
}
