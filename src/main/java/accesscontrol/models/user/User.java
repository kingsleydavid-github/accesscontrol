package accesscontrol.models.user;

import accesscontrol.models.roles.Admin;
import accesscontrol.models.roles.Electrician;
import accesscontrol.models.roles.Employee;
import accesscontrol.models.roles.IRole;
import accesscontrol.models.roles.Security;

public class User {
	
	//private Set<String> privileges = null;
	private final String name;
	private final String department;
	private final IRole role;
	
	public static class UserBuilder
	{
		private String name;
		private String department;
		private IRole role;
		
		public UserBuilder setName(String name)
		{
			this.name = name;
			return this;
		}
		public UserBuilder setDepartment(String department)
		{
			this.department = department;
			return this;
		}
		public UserBuilder setRole(String role)
		{
			this.role = setRoleByStr(role);
			return this;
		}
		private IRole setRoleByStr(String role2) {
			IRole role = new Employee();
			switch(role2)
			{
			case "admin":
				role= new Admin();
				break;
			case "employee":
				role= new Employee();
				break;
			case "electritian":
				role= new Electrician();
				break;
			case "security":
				role= new Security();
				break;
			}
			return role;
		}
		
	}
	
	public User(UserBuilder emp2)
	{
		this.name = emp2.name;
		this.role = emp2.role;
		this.department = emp2.department != null ? emp2.department : "default";
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
	public IRole getRole() {
		return role;
	}
	
}