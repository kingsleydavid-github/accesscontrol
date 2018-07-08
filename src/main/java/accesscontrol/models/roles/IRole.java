package accesscontrol.models.roles;

import java.util.Set;

public abstract class IRole {

	protected Set<String> privileges=null;
	public abstract Set<String> getPrivileges();
}
