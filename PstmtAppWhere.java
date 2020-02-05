import java.sql.*;
import java.util.*;
public class PstmtAppWhere {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstServlet","root","Amol@2121");
	   if(conn!=null)
	   {
		   Scanner xyz=new Scanner(System.in);
		   System.out.println("enter the email");
		   String email=xyz.nextLine();
		  PreparedStatement stmt=conn.prepareStatement("select *from register where email=?");
		  stmt.setString(1,email);
		  ResultSet rs=stmt.executeQuery();
		  if(rs.next())
		  {
			  System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		  }
		  else
		  {
			  System.out.println("Record Not Found");
		  }
			  
		  
	   }
	   else
	   {
		   System.out.println("Not Connected");
	   }
	}

}

