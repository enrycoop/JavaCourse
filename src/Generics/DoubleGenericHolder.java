package Generics;

public class DoubleGenericHolder<T,U> {
    T objT;
    U objU;

    DoubleGenericHolder(T objT, U objU){
        this.objT = objT;
        this.objU = objU;
    }

    public void display(){
        System.out.println("Displaying <T,U> generics");
        System.out.println("T: "+objT);
        System.out.println("U: "+objU);
    }

    public static void main(String args[]){
        DoubleGenericHolder<Integer,String> a = new DoubleGenericHolder<>(1, "a");
        a.display();
        DoubleGenericHolder<String,String> b = new DoubleGenericHolder<>("b", "B");
        b.display();

    }
}
