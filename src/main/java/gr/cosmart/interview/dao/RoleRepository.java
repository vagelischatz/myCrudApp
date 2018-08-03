package gr.cosmart.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.cosmart.interview.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	 Role findRoleByID(Integer roleId);
}
