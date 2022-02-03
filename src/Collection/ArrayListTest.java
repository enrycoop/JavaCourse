package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String args[]){
        // List è l'inrfaccia, ArrayList è l'implementazione concreta (classe)
        // questa è una best practise così da poter in futuro se serve cambiare l'Array, ma lasciando l'interfaccia.
        List<Integer> arrayList = new ArrayList<Integer>(5); 
        for (int i = 1 ; i<=5; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        arrayList.remove(3);

        for (int i : arrayList){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0 ; i< arrayList.size(); i++){
            System.out.print(arrayList.get(i)+ " ");
        }
        System.out.println();
    }
}
