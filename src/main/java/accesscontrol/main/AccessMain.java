package accesscontrol.main;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import accesscontrol.models.RoomFinder;
import accesscontrol.models.rooms.IRoom;
import accesscontrol.models.user.User;
import accesscontrol.models.user.User.UserBuilder;

public class AccessMain {

	public static void main(String[] args) {

		try
		{
			File input = new File("files/employees");		
			Scanner s = new Scanner(input);
			Map<String, User> allUsers = new HashMap<String, User>(); 
			while(s.hasNext())
			{
			    String[] t = s.next().split(",");
			    UserBuilder u1 = new User.UserBuilder().setName(t[0]).setRole(t[1]);
			    User user = new User(u1); 
			    allUsers.put(t[0], user);
			}
			
			input = new File("files/inputformat");
			s = new Scanner(input);
			while(s.hasNext())
			{
			    String[] t = s.next().split(",");
			    String roomName = t[1];
			    IRoom room = RoomFinder.getRoomByName(roomName);
			    if(room.hasAccess(allUsers.get(t[0])))
			    {
			        System.out.println("ACCESS_GRANTED");
			    }
			    else
			    {
			        System.out.println("ACCESS_DENIED");
			    }
			}
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
