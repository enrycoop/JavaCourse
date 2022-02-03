package OOP.Static;

public class Student {
    String name;
    int age;
    String address;

    static {
        //Stampato 1 volta anche se si creano più istanze
        System.out.println("STATIC Student inizializer");
    }

    static String college = "XYZ"; //la keyword static fa si che venga inizializzata 
                                   //1 solo volta per la classe (e non per ogni oggetto... )
                                   // RISPARMIO di memoria
                                   // gli oggetti useranno un RIFERIMENTO per questa variabile
    
    static int sCount = 0;

    static void studentCount(){
        sCount++;
        //System.out.println(name); <- this gives error! 
    }

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address= address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        return "Student name: " + getName() + "\nStudent age: " + getAge() + "\nStudent address: "+ getAddress();
    }
}

