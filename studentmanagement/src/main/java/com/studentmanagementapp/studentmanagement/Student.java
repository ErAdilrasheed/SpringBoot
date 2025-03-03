package com.studentmanagementapp.studentmanagement;

public class Student {
private int admnNo;
private String name;
private String age;
private String email;
private String course;

    public Student() {
    }

    public Student(int admnNo, String name, String age, String email, String course) {
        this.admnNo = admnNo;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

