package interview.model;

import interview.model.commands.RegisterCommand;
import interview.model.commands.ShowUsersCommand;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CommandInterface {
	
	public static final int STATUS_COMMAND_NOT_FOUND = 1;
	public static final int STATUS_OK = 0;

	static public String run(Map<String, String> params) throws SQLException{
		String commandName = params != null ? params.get("commandName") : null;
		if (commandName != null){
			if ("register".equals(commandName)){
				RegisterCommand command = new RegisterCommand(params.get("firstName"), params.get("lastName"));
				return command.execute();
			}
			if("Users".equals(commandName)){
				ShowUsersCommand command = new ShowUsersCommand();
				return command.execute();
			}
		}
		Map<String, String> result = new HashMap<>();
		result.put("status", Integer.toString(STATUS_COMMAND_NOT_FOUND));
		return result.toString();
	}

}
