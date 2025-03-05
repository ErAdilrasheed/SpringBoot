package com.studentmanagementapp.studentmanagement;

public class Teacher {
    private int id;
    private String name;
    private String age;
    private int NumberOfStudent;

    public Teacher() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        NumberOfStudent = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }
}
