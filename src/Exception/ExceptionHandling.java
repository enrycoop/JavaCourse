package Exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
    public static void main(String args[]){
        try{
            List<Integer> list = new ArrayList<>(10);
            list.add(1);

            System.out.println("Entering try statement");
            Integer a = list.get(1);
            System.out.println("accessing the first elem" + a );
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBounds ...");
        }
        finally{
            System.out.println("Finally!");
        }

        System.out.println();

        try{
            System.out.println("Entering try statement L1");
            try{
                List<Integer> list = new ArrayList<>(10);
                list.add(1);

                System.out.println("Entering try statement L2");
                Integer a = list.get(1);
                System.out.println("accessing the first elem" + a );
            }catch(IndexOutOfBoundsException e){
                System.out.println("catch statement L2");
                throw e;
            }
        }
        catch(Exception e){
            System.out.println("catch statement L1");
            System.out.println("Caught an Exception --> " + e);
        }
        finally{
            System.out.println("Finally!");
        }
    }
}
