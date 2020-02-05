import java.sql.*;
import java.util.*;
public class EnterData {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
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
		    int value=stmt.executeUpdate("insert into register values('"+name+"','"+email+"','"+contact+"')");
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

