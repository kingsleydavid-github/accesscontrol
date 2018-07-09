package accesscontrol.models.roles;

import java.util.HashSet;
import java.util.Set;

import accesscontrol.models.rooms.CommonArea;

public class Employee extends IRole {
	
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";
    
	public Set<String> getPrivileges() {
	
		if(privileges == null)
		{
			synchronized(Employee.class)
			{
				if(privileges == null)
				{
					privileges = new HashSet<String>();
					privileges.add(CommonArea.COMMOONAREA);
				}
			}
		}
		
		return privileges; 
	
	}
}
