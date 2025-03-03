package com.studentmanagementapp.studentmanagement;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository = new StudentRepository();

    public Student getStudent(int admnNo){
        return studentRepository.getStudent(admnNo);

    }

    public Student getStudentByPathVariable(int admnNo){
        return studentRepository.getStudentByPathVariable(admnNo);
    }

    public String addStudent(Student student){
        studentRepository.addStudent(student);
        return "Student Added Successfully!!!";
    }
}


