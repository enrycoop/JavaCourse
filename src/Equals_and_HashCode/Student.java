package Equals_and_HashCode;

public class Student {
    protected int id;
    private String name;
    private int age;
    private String address;
    
    public Student(int id, String name, int age, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address= address;
    }

////////////////////////////////////////////////
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Student s = (Student) obj;
        return (s.id == this.id);
    }
    @Override
    public int hashCode(){
        return id;
    }
//////////////////////////////////////////////////

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setId(int newValue){
        id = newValue;
    }
    public int getId(){
        return id;
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
