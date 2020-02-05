import java.sql.*;

public class DriverApplication2
{

	public static void main(String[] args)throws Exception
 {

		//Class.forName("com.mysql.jdbc.Driver");
		com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...............");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Amol@2121");
		if(conn!=null)
		{
			System.out.println("Success...............");
		}
		else
		{
			System.out.println("Failed.......................");
		}
	}
}

