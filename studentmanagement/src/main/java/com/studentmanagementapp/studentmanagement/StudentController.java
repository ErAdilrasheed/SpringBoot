package com.studentmanagementapp.studentmanagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class StudentController {
    StudentService studentService = new StudentService();

    //API endpoint
    @GetMapping("/get-student")      //https://student-managemntapp.com/get-student?id=1000
    public Student getStudent(@RequestParam("id") int admnNo){
        return studentService.getStudent(admnNo);
    }
    @GetMapping("/get-student-by-path/{id}")      //https://student-managemntapp.com/get-student-by-path/2000
    public Student getStudentByPathVariable(@PathVariable("id") int admnNo){
        return studentService.getStudentByPathVariable(admnNo);
    }
    // API for creating
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
      return studentService.addStudent(student);
    }
}
