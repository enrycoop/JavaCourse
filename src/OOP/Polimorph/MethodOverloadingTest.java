package OOP.Polimorph;

public class MethodOverloadingTest {
    public int multiply(int x, int y){
        return x*y;
    }

    public int multiply(int x, int y, int z){
        return x*y*z;
    }
    
    public double multiply(double x, double y){
        return x*y;
    }

    public static void main(String args[]){
        MethodOverloadingTest test = new MethodOverloadingTest();

        System.out.println( test.multiply(3, 4));
        System.out.println( test.multiply(3.5, 4.2));
        System.out.println( test.multiply(3, 4,7));
    }
}
