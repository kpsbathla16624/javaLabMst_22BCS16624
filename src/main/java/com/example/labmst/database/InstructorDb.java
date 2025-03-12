package com.example.labmst.database;

import java.util.List;

import com.example.labmst.Models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;




public interface InstructorDb extends JpaRepository<Instructor,String>{

    void saveAll(List<Instructor> instructors);
    Instructor findByID(String id);
    List<Instructor> findAll();

    void deleteById(String id);
    void delete(Instructor instructor);
    void deleteAll();
} 
