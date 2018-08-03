package gr.cosmart.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.cosmart.interview.dao.UserRepository;
import gr.cosmart.interview.domain.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepos;
	
	@Override
	public void addUser(User user) {
		userRepos.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userRepos.findAll();
	}

	@Override
	public void deleteUser(User user) {
		userRepos.delete(user);
		
	}

	@Override
	public User getByUserId(Integer id) {
		return userRepos.findUserByID(id);
	}
	
	@Override
	public void updateUser(Integer id) {
//		return catRepos.updateCategory(id);
	}
	
}
