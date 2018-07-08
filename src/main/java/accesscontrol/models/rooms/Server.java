package accesscontrol.models.rooms;

import accesscontrol.models.roles.IRole;
import accesscontrol.models.user.User;

public class Server implements IRoom{
	
	public static final String SERVER = "SERVER";

	public boolean hasAccess(User emp) {
		IRole role = emp.getRole();
		return role.getPrivileges().contains(SERVER);
	}

}
