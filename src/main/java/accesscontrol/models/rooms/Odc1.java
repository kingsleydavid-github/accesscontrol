package accesscontrol.models.rooms;

import accesscontrol.models.roles.IRole;
import accesscontrol.models.user.User;

public class Odc1 implements IRoom{
	
	public static final String ODC1 = "ODC1";
	
	public boolean hasAccess(User emp) {
		IRole role = emp.getRole();
		return role.getPrivileges().contains(ODC1);
	}

}
