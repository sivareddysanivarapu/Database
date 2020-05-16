import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
		String host="localhost";//for sql server it is common this value goes into below command
		String port="3306";
		//DriverManager.getConnection(url, user, password);
		//.get connection method is used to connect database with java project
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/siva","root","Sjdro#123");//by using this method we can connect the project to jdbc
//for  getting url use the following command "jdbc:mysql://" + host +":" + port +"/siva",
Statement s=con.createStatement();//it is just like a path to database to send queries
ResultSet rs=s.executeQuery("select * from employeeinfo where name='siva'");
while(rs.next()) {
//resultset is used to catch the throwable result from database
rs.getString("location");//for getting the details in that column location
rs.getString("id");
	}}
catch(Exception e){ System.out.println(e);} 
	}
}
