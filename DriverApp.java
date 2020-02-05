import java.sql.*;
import sun.jdbc.odbc.*;
class DriverApp
{
    public static void main(String x[])
    {
	JdbcOdbcDriver od=new JdbcOdbcDriver();
	DriverManager.registerDriver(od);
        System.out.println("Driver Registered Success.............");
    }
 }


