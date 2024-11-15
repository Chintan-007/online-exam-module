package com.roima.examination.online_exam_module.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


//This entity extends the base User entity and adds student-specific attributes like student ID, department, batch, etc.
//It represents a student user who will be taking the online examinations.


@Data
@EqualsAndHashCode(callSuper = true) //automatically generate the equals() and hashCode() methods for the Student class.
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student extends User {
    
    @Column(unique = true, nullable = false)
    private String studentId;
    
    @Column(nullable = false)
    private String department;
    
    @Column
    private String semester;
    
    @Column
    private Integer batch;

    @PrePersist
    @Override
    protected void onCreate() {
        super.onCreate();
        if (getRole() == null) {
            setRole(Role.STUDENT);
        }
    }
}
