package interview;

import interview.model.CommandInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class InterviewConsole {

	public static void main(String[] args) {
		
		InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        
		while(true){

	        System.out.println("Enter yourcommand here");
	        String userInput = null;
	        try{
				userInput = in.readLine();
	        }catch(Exception e){  
	        	System.out.println("Command error");
	        }
	        if (userInput != null){
	            String[] parts = userInput.split("\\s+");
	            Map<String, String> params = new HashMap<String, String>();
	            params.put("commandName", parts[0]);
	            params.put("firstName", parts[1]);
	            params.put("lastName", parts[2]);
	            System.out.println(CommandInterface.run(params).toString());     	
	        }
		}
	}

}
