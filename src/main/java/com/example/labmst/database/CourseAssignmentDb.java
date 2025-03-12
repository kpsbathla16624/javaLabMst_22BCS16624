package com.example.labmst.database;

import java.util.List;

import com.example.labmst.Models.Course;
import com.example.labmst.Models.CourseAssignment;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CourseAssignmentDb extends JpaRepository<CourseAssignment,String> {

    void saveAll(List<CourseAssignment> courseAssignments);
    Course findByID(String id);
    List<CourseAssignment> findAll();
    void deleteById(String id);
    void delete(CourseAssignment courseAssignment);
    void deleteAll();
    
}
