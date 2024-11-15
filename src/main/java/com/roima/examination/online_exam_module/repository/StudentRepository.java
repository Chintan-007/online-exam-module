package com.roima.examination.online_exam_module.repository;

import com.roima.examination.online_exam_module.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//This is the repository interface for the Student entity, providing methods specific to student management.
//It includes operations like finding a student by student ID or email.

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentId(String studentId);
    boolean existsByStudentId(String studentId);
    Optional<Student> findByEmail(String email);
}
