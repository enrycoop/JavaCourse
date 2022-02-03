package Exception;

public class SimpleExceptionTest {
    public static void main(String args[]){
        int data = 100/0; // > ArithmeticException
        System.out.println(data);

    //    String a = null;
    //    System.out.println(a.charAt(0)); // > NullPointerException
    }
}
