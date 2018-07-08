package accesscontrol.models.rooms;

import accesscontrol.models.roles.IRole;
import accesscontrol.models.user.User;

public class Ups implements IRoom{
	
	public static final String UPS = "UPS";

	public boolean hasAccess(User emp) {
		IRole role = emp.getRole();
		return role.getPrivileges().contains(UPS);
	}

}
