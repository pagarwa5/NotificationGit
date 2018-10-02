package com.notification.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import com.notification.services.UserManagementService;


public class ClassB {
	@Autowired
	private UserManagementService userManagementService;
	
	public void test() {
		System.out.println("test");
	}
}
