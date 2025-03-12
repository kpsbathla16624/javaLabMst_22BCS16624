package com.example.labmst.database;

import java.util.List;
import com.example.labmst.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentDb extends JpaRepository<Student,String>{

    void saveAll(List<Student> students);
    Student findByID(String id);
    Student save(Student student);
    List<Student> findAll();
    Student findByName(String name);

    void deleteById(String id);
    void delete(Student student);
    void deleteAll();
} 
