package com.studentmanagementapp.studentmanagement;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository = new StudentRepository();

    public Student getStudent(int admnNo){
        return studentRepository.getStudent(admnNo);

    }
    public Teacher getTeacherByName(String name){
        return studentRepository.getTeacherByName(name);
    }

    public Student getStudentByPathVariable(int admnNo){
        return studentRepository.getStudentByPathVariable(admnNo);
    }

    public String addStudent(Student student){
        studentRepository.addStudent(student);
        return "Student Added Successfully!!!";
    }
    public String addTeacher(Teacher teacher){
        studentRepository.addTeacher(teacher);
        return "Teacher Added Successfully!!!";
    }

    public List<String> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void deleteTeacherByName(String teacherName){
        studentRepository.deleteTeacherByName(teacherName);
    }

    public void addStudentTeacherPair(Integer studentId, Integer teacherId) {
        studentRepository.addStudentTeacherPair(studentId,teacherId);
    }

    public List<String> getStudentsByTeacherId(Integer teacherId) {
        return studentRepository.getStudentsByTeacherId(teacherId);
    }
}


