package com.notification.services;

import java.sql.SQLException;

import com.notification.entity.User;
import com.notification.request.UserRequest;

public interface UserManagementService {
	public User createUser(UserRequest request);

	public User getUserByUserName(String userName, String password) throws SQLException;
}
