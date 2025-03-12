package com.example.labmst.database;

import java.util.List;

import com.example.labmst.Models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EnrollmentDb extends JpaRepository<Enrollment,String>{

    void saveAll(List<Enrollment> enrollments);
    Enrollment findByID(String id);
    List<Enrollment> findAll();

    void deleteById(String id);
    void delete(Enrollment enrollment);
    void deleteAll();
} 
