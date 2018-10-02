package com.notification.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.notification.entity.User;
import com.notification.repositories.UserRepository;

@Repository
public class UserManagementDaoImpl implements UserManagementDao {

	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserByUserName(User user) {
		User result = null;
		Example<User> example = Example.of(user);
		List<User> userList =userRepository.findAll(example);
		if(!CollectionUtils.isEmpty(userList)) {
			result = userList.get(0);
		}
		return result;
		
	}

	

}
