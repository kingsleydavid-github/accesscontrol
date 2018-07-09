package accesscontrol.models.roles;

import java.util.Set;

public abstract class IRole {

	protected Set<String> privileges=null;
	public abstract Set<String> getPrivileges();
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((privileges == null) ? 0 : privileges.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        IRole other = (IRole) obj;
        if (privileges == null)
        {
            if (other.privileges != null) return false;
        }
        else if (!privileges.equals(other.privileges)) return false;
        return true;
    }
}
