import java.sql.*;
import java.util.*;
public class RunTimeEx {

	public static void main(String[] args)throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		//com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
		//DriverManager.registerDriver(d);
		System.out.println("Driver Registered Success...............");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstServlet","root","Amol@2121");
		if(conn!=null)
		{
			System.out.println("Success...............");
			Scanner xyz=new Scanner(System.in);
			System.out.println("enter the name email and contact");
			String name=xyz.nextLine();
			String email=xyz.nextLine();
			String contact=xyz.nextLine();
		    Statement stmt=conn.createStatement();
		    int value=stmt.executeUpdate("insert into register values()");
		    if(value>0)
		    {
		    	System.out.println("Success.............");
		    }
		    else
		    {
		    	System.out.println("Failed.....................");
		    }
		}
		else
		{
			System.out.println("Failed.......................");
		}
	}

}


