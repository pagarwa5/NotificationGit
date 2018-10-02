package com.notification.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notification.entity.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
}
