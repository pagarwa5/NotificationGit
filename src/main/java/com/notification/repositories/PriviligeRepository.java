package com.notification.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notification.entity.Privilege;


@Repository
public interface PriviligeRepository extends JpaRepository<Privilege, Long> {
	
}
