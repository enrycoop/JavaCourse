package OOP.Static;

public class StaticTest {
    public static void main(String args[]){
        Student jhon = new Student("Jhon", 21, "An address");

        //System.out.println(jhon.college); <-- Works! but with a warning
        System.out.println(Student.college);

        jhon.college = "test"; //< verrà modificato per TUTTE LE ISTANZE
        Student ben = new Student("ben", 21, "An address");
        System.out.println(ben.college);


    }
}
