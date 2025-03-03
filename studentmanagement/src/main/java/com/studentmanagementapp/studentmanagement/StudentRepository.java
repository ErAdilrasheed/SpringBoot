package com.studentmanagementapp.studentmanagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> studentDb = new HashMap<>();

    public Student getStudent(int admnNo){
        return studentDb.get(admnNo);
    }
    public Student getStudentByPathVariable(int admnNo){
        return studentDb.get(admnNo);
    }
    public void addStudent(Student student){
    studentDb.put(student.getAdmnNo() , student);

    }
}
