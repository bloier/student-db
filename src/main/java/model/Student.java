package model;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private String subject;

    public Student(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, subject);
    }

    public String studentAttributes() {
        return "Name of student: " + name + ", age: " + age + ", subject: " + subject;
    }
}