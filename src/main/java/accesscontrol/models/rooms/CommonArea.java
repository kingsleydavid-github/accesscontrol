package accesscontrol.models.rooms;

import accesscontrol.models.roles.IRole;
import accesscontrol.models.user.User;

public class CommonArea implements IRoom{
	
	public static final String COMMOONAREA = "COMMONAREA";

	public boolean hasAccess(User emp) {
		IRole role = emp.getRole();
		return role.getPrivileges().contains(COMMOONAREA);
	}

}
