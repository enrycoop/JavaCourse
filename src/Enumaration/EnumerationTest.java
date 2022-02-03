package Enumaration;

public class EnumerationTest {
    public static void main(String args[]){
        Color c1 = Color.RED;

        System.out.println(c1);
        System.out.println(c1.getValue());

        for (Color c : Color.values()){
            System.out.println("Value : "+c.name());
        }
    }
}
