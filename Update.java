import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update
{

            public static void main(String[] args) {
                try
                {   //load the driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // create a connection

                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/db","root","root");
                    // create query
                    String s="UPDATE student set student_name='rahul kankal' where student_No=5";
                    Statement st=con.createStatement();
                    st.executeUpdate(s);
                    System.out.println("table is updated");
                    con.close();


                    if(con.isClosed())
                    {
                        System.out.println("connection closed");
                    }
                    else
                    {
                        System.out.println("connection succesfull");
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }





