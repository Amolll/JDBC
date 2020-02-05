import java.sql.*;

public class DriverApplication {
    public static void main(String... args) {

        try {
            String dbUrl = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Amol@2121";

            Class.forName("com.mysql.jdbc.Driver");

            Connection myConnection = DriverManager.getConnection(dbUrl,username, password);

            Statement myStatement = myConnection.createStatement();

            ResultSet myResultset = myStatement.executeQuery("select * from students");

            while (myResultset.next()) {
                System.out.println(
                        "Full Name" + myResultset.getString("firstname") + " " + myResultset.getString("lastname"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}


