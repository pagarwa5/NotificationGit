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
	
	
	 
	 int count=0;
	
	
	@RequestMapping("/hello")
	public String hello() {
		
		synchronized (HomeController.class) {
			count++;
		}
		System.out.println(count);
		//ClassB b  =  new ClassB();
		
		
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

		return "Number of requests are"+count;
	}
}
