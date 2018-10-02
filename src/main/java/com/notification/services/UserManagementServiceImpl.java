package com.notification.services;

import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.notification.dao.UserManagementDao;
import com.notification.entity.Address;
import com.notification.entity.User;
import com.notification.request.UserRequest;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	private UserManagementDao userManagementDao;

	@Override
	public User createUser(UserRequest request) {
		User user = buildDaoRequest(request);
		User result = userManagementDao.createUser(user);
		return result;
	}

	private User buildDaoRequest(UserRequest request) {
		User user = new User();
		Address address = new Address();
		user.setFirstName(request.getFirstName());
		user.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
		user.setLastName(request.getLastName());
		user.setEmail(request.getEmail());
		user.setMobile(request.getMobile());
		user.setUserName(request.getUserName());
		user.setAddress(setAddress(address, request));
		return user;
	}
	

	private Address setAddress(Address daoAddress, UserRequest request) {
		Address address = request.getAddress();
		BeanUtils.copyProperties(address, daoAddress);
		return daoAddress;
	}

	@Override
	public User getUserByUserName(String userName, String password) throws SQLException {
		User result;
		User user =buildCreateUserDaoRequest(userName,password);
		result = userManagementDao.getUserByUserName(user);
		if(result!=null && !BCrypt.checkpw(password, result.getPassword())) {
			throw new SQLException("Password not matched Exception", "Invalid Data");
		}
		return result;
	}
	private User buildCreateUserDaoRequest(String userName,String password) {
		User user = new User();
		//user.setPassword(BCrypt.hashpw(password, BCrypt.gensalt()));
		user.setUserName(userName);
		return user;
	}

}
