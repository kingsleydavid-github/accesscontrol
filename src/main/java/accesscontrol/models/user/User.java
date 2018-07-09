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
			if(role2.equals("admin"))
			    role= new Admin();
		    if(role2.equals("employee"))
		        role= new Employee();
	        if(role2.equals("electritian"))
	            role= new Electrician();
            if(role2.equals("security"))
                role= new Security();
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
	
	@Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        User other = (User) obj;
        if (department == null)
        {
            if (other.department != null) return false;
        }
        else if (!department.equals(other.department)) return false;
        if (name == null)
        {
            if (other.name != null) return false;
        }
        else if (!name.equals(other.name)) return false;
        if (role == null)
        {
            if (other.role != null) return false;
        }
        else if (!role.equals(other.role)) return false;
        return true;
    }
	
}