import java.sql.*;
import java.lang.*;
import java.sql.Connection;

public class InsertData
{
    public static void main(String[] args)
    {


     try
        {  // load and register
         Class.forName("com.mysql.cj.jdbc.Driver");
         // Establish connection
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/db","root","root");
        String s="INSERT INTO STUDENT(STUDENT_NO,STUDENT_NAME,STUDENT_DOB,STUDENT_DOJ)VALUES(?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(s);
        // set prepared object
            ps.setString(1,"8");
            ps.setString(2,"PRATIK MORE");
            ps.setString(3,"2022-04-20");
            ps.setString(4,"1994-02-06");


            System.out.println();



ps.executeUpdate();
            System.out.println("data inserted");
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
