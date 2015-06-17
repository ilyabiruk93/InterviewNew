package interview.dao;

import interview.domain.User;

public class UsersDao {
	
	private static final String SQL_INSERT_USER = "INSERT INTO users (first_name, last_name) VALUES ('%s','%s')";

	public static User createUser(String userName, String lastName){
		 try{
             Db.executeUpdate(String.format(SQL_INSERT_USER, userName, lastName));
         } 
		 catch(Exception e){
			 e.printStackTrace();
         }
		return null;
	}

}
