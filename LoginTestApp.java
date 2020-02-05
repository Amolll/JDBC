import java.sql.*;
import java.util.*;

public class LoginTestApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		com.mysql.jdbc.Driver d = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstServlet", "root", "Amol@2121");
		if (conn != null) {
			Scanner xyz = new Scanner(System.in);
			System.out.println("enter the username");
			String username = xyz.nextLine();
			System.out.println("enter the password");
			String password = xyz.nextLine();
			PreparedStatement stmt = conn.prepareStatement("select *from logintest where username=? and password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.println("Login Success...................");
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			} else {
				System.out.println("Invalid username and password");

			}

		} else {
			System.out.println("Not Connected");
		}

	}

}

