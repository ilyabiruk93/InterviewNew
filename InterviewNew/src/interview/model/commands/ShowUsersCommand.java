package interview.model.commands;

import java.sql.SQLException;

import interview.dao.UsersDao;

public class ShowUsersCommand {
	
	public String execute() throws SQLException{
		return UsersDao.showUsers();
	}
}
