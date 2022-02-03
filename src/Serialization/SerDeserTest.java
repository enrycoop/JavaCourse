package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserTest {
    public static void main(String args[]){
        Student s = new Student("Ben", 22, "Address1");
        s.setX(20);
        System.out.println("X : " + s.getX());
        String filename = "./src/Serialization/ser-test.txt";

        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        //Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(s);

            objOut.close();
            fileOut.close();

            System.out.println("Serialization completed!");
        }catch(IOException e){
            System.out.println("IOEXCEPTION caugght... -> "+ e );
        }

        //Deserialization
         FileInputStream fileIn = null;
         ObjectInputStream objIn = null;

         try{
             fileIn = new FileInputStream(filename);
             objIn = new ObjectInputStream(fileIn);

             Student obj = (Student) objIn.readObject();

             System.out.println("Deserialization completed! --> \n" + obj);

             System.out.println("X: "+ obj.getX());
             objIn.close();
             fileIn.close();
         } catch(IOException e){
             System.out.println("IOException caught...");
         } catch(ClassNotFoundException e){
             System.out.println("ClassNotFoundException caught....");
         }
    }
}
