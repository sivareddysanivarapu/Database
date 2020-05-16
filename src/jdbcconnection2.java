import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection2 {
			public static void main(String args[])
			{
			    try
			    {
			        Class.forName("com.mysql.jdbc.Driver");
			    }
			    catch(ClassNotFoundException e)
			    {
			        e.printStackTrace();
			    }
			    try{
			        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siva","root","Sjdro#123");
			        Statement st=con.createStatement();
			        ResultSet rs=st.executeQuery("select * from employeeinfo where name='siva'");
			        while(rs.next()) {
			        //resultset is used to catch the throwable result from database
			      System.out.println(  rs.getString("location"));//for getting the details in that column location
			      System.out.println(  rs.getString("id"));
			        	}
			    }
			    catch(SQLException e)
			    {
			        e.printStackTrace();
			    }
			}
			}

	


