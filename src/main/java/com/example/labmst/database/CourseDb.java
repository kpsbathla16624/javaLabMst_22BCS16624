package com.example.labmst.database;

import java.util.List;

import com.example.labmst.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseDb extends JpaRepository<Course,String>{

    void saveAll(List<Course> courses);
    Course findByID(String id);
    List<Course> findAll();
    Course save(Course course);

    void deleteById(String id);
    void delete(Course course);
    void deleteAll();
} 
