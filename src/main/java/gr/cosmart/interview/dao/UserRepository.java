package gr.cosmart.interview.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.cosmart.interview.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	 User findUserByID(Integer userId);
}
