import java.sql.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class insert{
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/First";
		String username = "root";
		String password = "Amol@2121";
	
		try {
						
            Connection myConnection = DriverManager.getConnection(url,username, password);
			Statement myStatement =myConnection.createStatement();

			String sqlQuery="insert into First(id,firstname,lastname) values(2,'sunil','Hwlkar');";
		
			myStatement.executeUpdate(sqlQuery);
			System.out.println("Insertion Completed");
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}