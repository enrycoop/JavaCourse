package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String args[]) throws FileNotFoundException, IOException, MyException{ //Senza il throws non posso compilare
        FileReader file = new FileReader("/test/path/to/file.txt");
        BufferedReader fileinput = new BufferedReader(file);

        for (int counter = 0; counter >3 ; counter++){
            System.out.println(fileinput.readLine());
        }
        fileinput.close();

        throw new MyException();
    }

}
