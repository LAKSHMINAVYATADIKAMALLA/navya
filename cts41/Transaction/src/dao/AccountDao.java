package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountDao
{
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
     
    public AccountDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
	public void withdraw(float amount)
	{
		
	}
	public void deposit(float amount)
	{
		connect();
		String sql="update account set balance=balance+amount where accountNumber="+acctNumber;
		Statement statement = jdbcConnection.createStatement();
		int status=statement.executeupdated(sql);
		System.out.println("amount deposited");
	}
	public float getBalance(String accountNumber)
	{
		connect();
		String sql="="+acctNumber
		Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);		

		
		
	}
	

    }
