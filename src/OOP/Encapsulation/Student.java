package OOP.Encapsulation;

public class Student {
    private String name;
    private int age;
    private String address;
    
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
