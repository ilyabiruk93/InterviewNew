package interview.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
	
	private static String user = "root";//Логин пользователя
    private static String password = "123";//Пароль пользователя
    private static String url = "jdbc:mysql://127.0.0.1:3306/interview_new";//URL адрес
	private static Connection connection;
	
	
	public static void Update(String command) throws SQLException {
		getStatement().executeUpdate(command);
		
	}
	
	private static Statement getStatement() throws SQLException{
	    Connection c = getConnection();
	    Statement st = c.createStatement();//Готовим запрос
	    return st;
	}
	
	private static Connection getConnection() throws SQLException{
		if (connection == null){
			connection = DriverManager.getConnection(url, user, password);//Установка соединения с БД
		}
		return connection;
	}

	public static ResultSet Show(String sqlString) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs=getStatement().executeQuery(sqlString);
		return rs;		
	}

}
