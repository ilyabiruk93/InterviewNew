package interview.model.commands;

import interview.dao.UsersDao;

public class RegisterCommand implements ICommand {
	
	private String firstName;
	private String lastName;
	

	public RegisterCommand(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String execute() {
		// TODO Auto-generated method stub
		UsersDao.createUser(firstName, lastName);
		return null;
	}

}
