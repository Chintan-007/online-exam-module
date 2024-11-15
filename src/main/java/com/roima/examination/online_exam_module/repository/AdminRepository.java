package com.roima.examination.online_exam_module.repository;

import com.roima.examination.online_exam_module.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//This is the repository interface for the Admin entity, providing methods specific to admin management.
//It includes operations like finding an admin by email.

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByEmail(String email);
}
