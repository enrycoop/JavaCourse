package Equals_and_HashCode;

class ComparableStudent extends Student implements Comparable<ComparableStudent> {
    
    public ComparableStudent(int id, String name, int age, String address){
        super(id,name,age,address);
    }

    @Override
    public int compareTo(ComparableStudent s){
        return this.id - s.id;
        // if ret = 0 - no matter who is the first
        // if ret > 0 - THIS come first
        // if ret < 0 - S come first
    }

    @Override
    public String toString(){
        return "id: " + this.id;
    }
}