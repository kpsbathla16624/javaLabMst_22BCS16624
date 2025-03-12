package com.example.labmst.services;

import com.example.labmst.Models.Student;
import com.example.labmst.database.StudentDb;

import java.util.List;



public class StudentService {
    
    private StudentDb studentDb;
    public Student createStudent(Student student)
    {
        return studentDb. save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentDb.findAll();
    }

    public Student getStudentByID(String id)
    {
        return studentDb.findByID(id);
    }
    
    public void deleteById(String id)
    {
        studentDb.deleteById(id);
    }
    public void deleteAll()
    {
        studentDb.deleteAll();
    }

    public Student getByName(String name)
    {
        return studentDb.findByName(name);
    }

}
