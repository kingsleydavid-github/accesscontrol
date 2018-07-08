package accesscontrol.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import accesscontrol.models.rooms.IRoom;
import accesscontrol.models.rooms.Server;
import accesscontrol.models.user.User;
import accesscontrol.models.user.User.UserBuilder;

public class AccessMain {

	public static void main(String[] args) {

		try
		{
			File input = new File("resources/inputformat.text");		
			Scanner s = new Scanner(input);
			UserBuilder u1 = new User.UserBuilder().setName("david").setRole("employee");
			User user1 = new User(u1); 
			IRoom s1 = new Server();			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
