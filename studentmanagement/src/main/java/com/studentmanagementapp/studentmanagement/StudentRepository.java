package com.studentmanagementapp.studentmanagement;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer, Student> studentDb = new HashMap<>();
    Map<Integer, Teacher> teachersDb = new HashMap<>();
    Map<Integer, List<Integer>> teacherStudentDb = new HashMap<>();

    public Student getStudent(int admnNo){
        return studentDb.get(admnNo);
    }


    public Student getStudentByPathVariable(int admnNo){
        return studentDb.get(admnNo);
    }

    public void addStudent(Student student){
    studentDb.put(student.getAdmnNo() , student);

    }

    public void addTeacher(Teacher teacher){
        teachersDb.put(teacher.getId(), teacher);
    }

    public Teacher getTeacherByName(String name){
        for (Integer teacherId: teachersDb.keySet()){
            if (teachersDb.get(teacherId).getName().equals(name)){
            return teachersDb.get(teacherId);
            }
        }
        return null;
    }

    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        for(Integer id: studentDb.keySet()){
            students.add(studentDb.get(id).getName());
        }
        return students;
    }

    public void deleteTeacherByName(String teacherName){
        int teacherId = -1;
        for(Integer id: teachersDb.keySet()){
            if(teachersDb.get(id).getName().equals(teacherName)){
                teacherId = id;
                break;
            }
        }
        if(teacherId!=-1){
            teachersDb.remove(teacherId);
            teacherStudentDb.remove(teacherId);
        }

    }

    public void addStudentTeacherPair(Integer studentId, Integer teacherId) {
        if (studentDb.containsKey(studentId) && teachersDb.containsKey(teacherId)){
            if(!teacherStudentDb.containsKey(teacherId)){
                teacherStudentDb.put(teacherId, new ArrayList<>());
            }
            teacherStudentDb.get(teacherId).add(studentId);
        }
    }

    public List<String> getStudentsByTeacherId(Integer teacherId) {
        List<Integer> studentIds = teacherStudentDb.get(teacherId);
        List<String> students = new ArrayList<>();
        if (studentIds!=null){
        for(int studentId: studentIds){
          students.add(studentDb.get(studentId).getName());
        }
        }
        return students;
    }
}
