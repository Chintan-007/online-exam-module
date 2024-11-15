package com.roima.examination.online_exam_module.repository;


import com.roima.examination.online_exam_module.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//This is the repository interface that provides methods for interacting with the User entity in the database.
//It includes basic CRUD operations as well as custom query methods like finding a user by email.

@Repository
public interface UserRepository extends JpaRepository<User, Long> { 
	//<User>: Indicates that this repository manages User entities.
	//<Long>: Specifies the type of the primary key (id) of the User entity.
    
	//Optional handles cases where a User might not exist
	Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}