package gr.cosmart.interview.service;

import java.util.List;

import gr.cosmart.interview.domain.User;

public interface UserService {

	List<User> getAllUsers();

	void addUser(User user);

	void deleteUser(User user);

	User getByUserId(Integer userId);

	void updateUser(Integer userID);

}
