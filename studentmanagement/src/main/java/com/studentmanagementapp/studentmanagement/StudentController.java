package com.studentmanagementapp.studentmanagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class StudentController {
    Map<Integer, Student> studentDb = new HashMap<>();

    //API endpoint
    @GetMapping("/get-student")      //https://student-managemntapp.com/get-student?id=1000
    public Student getStudent(@RequestParam("id") int admnNo){
        return studentDb.get(admnNo);
    }
    @GetMapping("/get-student-by-path/{id}")      //https://student-managemntapp.com/get-student-by-path/2000
    public Student getStudentByPathVariable(@PathVariable("id") int admnNo){
        return studentDb.get(admnNo);
    }
    // API for creating
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
      studentDb.put(student.getAdmnNo(), student);
              return "Student Added Successfully!!!";
    }
}
