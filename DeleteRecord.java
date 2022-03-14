import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {
    public static void main(String[] args)
    {
        try
        {   //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db", "root", "root");
            // create query
            String s = "DELETE FROM student where student_No=6";
            Statement st = con.createStatement();
            st.executeUpdate(s);
            System.out.println("Record is Deleted..");
            con.close();


            if (con.isClosed()) {
                System.out.println("connection closed");
            } else {
                System.out.println("connection succesfull");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
