package Annotation.jsonSer;

public class Main {
    public static void main(String[] args) throws JsonSerializationException {
        Person person = new Person("Anna", "Paglia", "21","Via Garibaldi 54");
        JsonSerAnnotationProcess jap = new JsonSerAnnotationProcess();
        String personToJson = jap.convertToJson(person);
        System.out.println("Result : \n" + personToJson);
    }
}
