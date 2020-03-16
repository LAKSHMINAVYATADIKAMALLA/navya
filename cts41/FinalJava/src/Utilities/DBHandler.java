package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler 
{
public static Connection establishConnection() throws ClassNotFoundException,IOException
{
 Connection con=null;
 FileInputStream fis=new FileInputStream("d://db.properties");
 Properties properties=new Properties();
 properties.load(fis);
 try 
 {
  String dname=(String) properties.get("dname");
  String url=(String) properties.get("url");
  String username=(String) properties.get("username");
  String password=(String) properties.get("password");
 
  Class.forName(dname);
  con=DriverManager.getConnection(url,username,password);
  if(con!=null)
  System.out.println("connection is established..");
  else
  System.out.println("conection not established");
 }
 catch(SQLException e)
 {
 }
 return con;
}
}
