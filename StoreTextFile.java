import java.io.*;
import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class StoreTextFile
{
     public static void main(String x[])throws Exception
     {
       com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstServlet","root","Amol@2121");
	

	if(conn!=null)
	{
	
	File f=new File("/home/amol/Advance Java/JDBC/demo.txt"); 
	  FileReader fr=new FileReader(f);
        long len=f.length();
   PreparedStatement stmt=conn.prepareStatement("insert into StoreTextFile values(?,?)");
	stmt.setInt(1,100);
	stmt.setCharacterStream(2,fr,(int)len);
	int value=stmt.executeUpdate();
	if(value>0)
	{ System.out.println("Success.............");
	}
	else
	{ System.out.println("Failed.................");
	}
	
	}
	else
	{System.out.println("Not Connected");
	}
     }
  }

