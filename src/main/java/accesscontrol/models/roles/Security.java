package accesscontrol.models.roles;

import java.util.HashSet;
import java.util.Set;

import accesscontrol.models.rooms.CommonArea;
import accesscontrol.models.rooms.Odc1;
import accesscontrol.models.rooms.Odc2;
import accesscontrol.models.rooms.Server;
import accesscontrol.models.rooms.Ups;

public class Security extends IRole{
	public Set<String> getPrivileges() {
		
		if(privileges == null)
		{
			synchronized(Employee.class)
			{
				if(privileges == null)
				{
					privileges = new HashSet<String>();
					privileges.add(CommonArea.COMMOONAREA);
					privileges.add(Server.SERVER);
					privileges.add(Ups.UPS);
					privileges.add(Odc1.ODC1);
					privileges.add(Odc2.ODC2);
				}
			}
		}
		return privileges; 
	}
}
