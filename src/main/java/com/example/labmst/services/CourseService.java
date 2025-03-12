package com.example.labmst.services;

import com.example.labmst.Models.Course;
import com.example.labmst.database.CourseDb;

import java.util.List;




public class CourseService {

    private CourseDb courseDb;

    public Course createCourse(Course course) {
        return courseDb.save(course);
    }

    public List<Course> getAllCourses() {
        return courseDb.findAll();
    }

    public Course getCourseByID(String id) {
        return courseDb.findByID(id);
    }

    public void deleteById(String id) {
        courseDb.deleteById(id);
    }

    public void deleteAll() {
        courseDb.deleteAll();
    }
}
