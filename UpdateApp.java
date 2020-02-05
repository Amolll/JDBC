import java.sql.*;
import java.util.*;
public class UpdateApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstServlet","root","Amol@2121");
		if(conn!=null)
		{Scanner xyz=new Scanner(System.in);
		System.out.println("enter the  name email  contact ");
		String name=xyz.nextLine();
		String email=xyz.nextLine();
		String contact=xyz.nextLine();
			PreparedStatement stmt=conn.prepareStatement("update register set name=?,contact=? where email=?");
			stmt.setString(1,name);
			stmt.setString(2, contact);
			stmt.setString(3,email);
			int value=stmt.executeUpdate();
			if(value>0)
			{
				System.out.println("Success................");
			}
			else
			{
				System.out.println("Failed..................");
			}
		}
		else
		{
			System.out.println("Not connected");
		}

	}

}


