package CRUD;
import  java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    public static void main(String[] args) {
        DB_Connection d =new DB_Connection();
        System.out.println(d.get_Connection());
    }
    public Connection get_Connection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}