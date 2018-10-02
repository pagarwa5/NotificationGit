package com.notification.dao;

import com.notification.entity.User;

public interface UserManagementDao {
	
	public User createUser(User user);

	public User getUserByUserName(User user);
}
