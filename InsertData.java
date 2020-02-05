import java.sql.*;
public class InsertData 
{

	public static void main(String[] args)throws Exception 
{
		
		//Class.forName("com.mysql.jdbc.Driver");
		com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);


		System.out.println("Driver Registered Success...............");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstServlet","root","Amol@2121");
		if(conn!=null)
		{
			System.out.println("Success...............");
		    Statement stmt=conn.createStatement();
		    int value=stmt.executeUpdate("insert into register values('ram','ram@gmail.com','99999999')");
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





