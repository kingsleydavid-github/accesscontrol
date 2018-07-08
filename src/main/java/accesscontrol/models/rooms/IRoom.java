package accesscontrol.models.rooms;

import accesscontrol.models.user.User;

public interface IRoom {
	
	public boolean hasAccess(User emp);
}
