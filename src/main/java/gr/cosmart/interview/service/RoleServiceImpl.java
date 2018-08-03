package gr.cosmart.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.cosmart.interview.dao.RoleRepository;
import gr.cosmart.interview.domain.Role;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepos;
	
	@Override
	public void addRole(Role role) {
		roleRepos.save(role);
		
	}

	@Override
	public List<Role> getAllRoles() {
		return roleRepos.findAll();
	}

	@Override
	public void deleteRole(Role role) {
		roleRepos.delete(role);
		
	}

	@Override
	public Role getByRoleId(Integer id) {
		return roleRepos.findRoleByID(id);
	}
	
	@Override
	public void updateRole(Integer id) {
//		return catRepos.updateCategory(id);
	}
	
}
