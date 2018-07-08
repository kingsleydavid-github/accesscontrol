package accesscontrol.models.rooms;

import accesscontrol.models.roles.IRole;
import accesscontrol.models.user.User;

public class Odc2 implements IRoom{

	public static final String ODC2 = "ODC2";
	
	public boolean hasAccess(User emp) {
		IRole role = emp.getRole();
		return role.getPrivileges().contains(ODC2);
	}

}
