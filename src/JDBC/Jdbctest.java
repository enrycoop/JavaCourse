package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbctest {
    public static void main (String args[]) throws SQLException{
        String url = "jdbc:postgresql://localhost/testdb";

        Connection conn = null;

        int rollno = 1;
        String name = "Jhon";
        int age = 20;
        String sql = "INSERT INTO student(rollno,name,age) " + "VALUES ("+rollno + ",'"+name+"',"+age+")";
        String username = "testuser";
        String password = "testPsw";

        try{
            conn = DriverManager.getConnection(url, username, password);

            Statement st = conn.createStatement(); //Statement object to CREATE
            int m = st.executeUpdate(sql); // ritorna il numero di rows affected
            if (m == 1){
                System.out.println("inserted successfully: " + sql);
            }
            else{
                System.out.println("Insertion failed.");
            }
        }catch(Exception e){
            System.out.println("Exception caught -> "+ e);
        }finally{
            conn.close();
        }
    }
}
