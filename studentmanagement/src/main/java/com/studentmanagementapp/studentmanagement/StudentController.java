package com.studentmanagementapp.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    StudentService studentService;

    //API endpoint
    @GetMapping("/get-student")      //https://student-managemntapp.com/get-student?id=1000
    public ResponseEntity getStudent(@RequestParam("id") int admnNo){
        Student student = studentService.getStudent(admnNo);
        return new ResponseEntity<>(student , HttpStatus.OK);
    }
    @GetMapping("/get-student-by-path/{id}")      //https://student-managemntapp.com/get-student-by-path/2000
    public ResponseEntity getStudentByPathVariable(@PathVariable("id") int admnNo){
        Student student = studentService.getStudentByPathVariable(admnNo);
        return new ResponseEntity(student , HttpStatus.OK);
    }
    // API for creating
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
      String message =  studentService.addStudent(student);
      return new ResponseEntity(message,HttpStatus.CREATED);
    }
    @PostMapping("/add-teacher")
    public ResponseEntity addTeacher(@RequestBody Teacher teacher){
        String message = studentService.addTeacher(teacher);
        return new ResponseEntity(message, HttpStatus.CREATED);
    }
    @GetMapping("/get-teacher-by-name/{name}")
    public ResponseEntity getTeacherByName(@PathVariable ("name") String name){
        Teacher teacher = studentService.getTeacherByName(name);
        return new ResponseEntity(teacher , HttpStatus.FOUND);
    }
    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete-teacher-by-name")
    public ResponseEntity<String> deleteTeacherByName(@RequestParam ("name") String teacherName){
        studentService.deleteTeacherByName(teacherName);
        return new ResponseEntity<>("Teacher deleted successfully!!!" , HttpStatus.ACCEPTED);
    }

    @PutMapping("/add-student-teacher-pair")
    public ResponseEntity<String> addStudentTeacherPair(@RequestParam Integer studentId,
                                                        @RequestParam Integer teacherId){
        studentService.addStudentTeacherPair(studentId,teacherId);
        return new ResponseEntity("Teacher Student Pair Added Successfully!" , HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-student-teacher-id/{teacherId}")
    public ResponseEntity<List<String>> getStudentsByTeacherId(@PathVariable Integer teacherId){
        List<String> students = studentService.getStudentsByTeacherId(teacherId);
        return new ResponseEntity<>(students, HttpStatus.FOUND);
    }
}
