package com.notification.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notification.entity.Role;
import com.notification.entity.User;
import com.notification.repositories.UserRepository;
import com.notification.services.UserManagementService;

@RestController
public class HomeController {
	
	 @Autowired
	 private ClassB b;
	 
	
	
	@RequestMapping("/hello")
	public String hello() {
		//ClassB b  =  new ClassB();
		b.test();
		System.out.println(b);
		/* User user = new User("user1");
	       Set<Role> roles = new HashSet<Role>() {
	    	   {
	    		   add(new Role("role1",user));
	    		   add(new Role("role2",user));
	    		   add(new Role("role3",user));
	    	   }
	       };
	       user.setRoles(roles);
	       userRepository.save(user);*/
	      /* userRepository.save(new HashSet<User>() {{
	            add(user);
	          
	        }});*/

		return "Hello!";
	}
}
