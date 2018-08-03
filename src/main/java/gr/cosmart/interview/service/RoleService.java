package gr.cosmart.interview.service;

import java.util.List;

import gr.cosmart.interview.domain.Role;

public interface RoleService {

	List<Role> getAllRoles();

	void addRole(Role role);

	void deleteRole(Role role);

	Role getByRoleId(Integer roleId);

	void updateRole(Integer roleId);

}
