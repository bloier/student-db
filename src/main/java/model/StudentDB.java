package model;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    public Student randomStudent() {
        Student randomStudent = students[(int)(Math.random() * students.length)];
        return randomStudent;
    }

    //doesn't override Student.toString() but uses it
    @Override
    public String toString() {
        return "StudentDB contains the students: " + Arrays.toString(students);
    }
    //return "Name of student: " + name + ", age: " + age + ", subject: " + subject;


}
