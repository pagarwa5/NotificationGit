package com.notification.controllers;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.notification.common.JsonResponse;
import com.notification.entity.User;
import com.notification.request.UserRequest;
import com.notification.services.UserManagementService;

@RestController
public class UserManagementController {

	@Autowired
	private UserManagementService userManagementService;

	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@Valid @RequestBody UserRequest userRequest) {
		JsonResponse response = new JsonResponse();
		User result = userManagementService.createUser(userRequest);
		if (result != null) {
			response.setData(result);
			response.setSuccess(Boolean.TRUE);
			response.setStatus(HttpStatus.CREATED);
			return new ResponseEntity<JsonResponse>(response, HttpStatus.CREATED);
		}	
	
		return new ResponseEntity<JsonResponse>(response, HttpStatus.NO_CONTENT);

	}
	
	@GetMapping("/getUserByUserName/{userName}")
	public ResponseEntity<?> createUser(@PathVariable(value = "userName") String userName ,@RequestHeader(value="password") String password) throws SQLException {
		JsonResponse response = new JsonResponse();
		System.out.println("password"+password);
		User result = userManagementService.getUserByUserName(userName,password);
		if (result != null) {
			response.setData(result);
			response.setSuccess(Boolean.TRUE);
			response.setStatus(HttpStatus.OK);
			return new ResponseEntity<JsonResponse>(response, HttpStatus.OK);
		}
	
		return new ResponseEntity<JsonResponse>(response, HttpStatus.NO_CONTENT);

	}
	
}
