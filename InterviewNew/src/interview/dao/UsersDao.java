package interview.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import interview.domain.User;

public class UsersDao {
	
	private static final String SQL_INSERT_USER = "INSERT INTO users (first_name, last_name) VALUES ('%s','%s')";
	private static final String SQL_SHOW_USERS="select * from users";
	public static User createUser(String userName, String lastName){
		 try{
             Db.Update(String.format(SQL_INSERT_USER, userName, lastName));
         } 
		 catch(Exception e){
			 e.printStackTrace();
         }
		return null;
	}
	public static String showUsers() throws SQLException{		
			ResultSet rs=Db.Show(SQL_SHOW_USERS);
			String s=null;
			while(rs.next()){
	          	  s = s+ (rs.getString("first_name")+" "+rs.getString("last_name")+"\n");
			}		
	        return s;
			
		
	}

}
