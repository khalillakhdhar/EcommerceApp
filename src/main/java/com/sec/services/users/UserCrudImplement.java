package com.sec.services.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.users.User;
import com.sec.repositories.user.UserRepository;

@Service
public class UserCrudImplement implements UserCrudInterface {
@Autowired
UserRepository userrepository;
	
	
	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return userrepository.save(u);
	}

	@Override
	public List<User> showUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userrepository.findAll();
	}

	@Override
	public Optional<User> findUserByid(long id) {
		// TODO Auto-generated method stub
		return userrepository.findById(id);
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userrepository.deleteById(id);
	}

}
