package model;

public class StudentCreator {

    public static Student[] students = new Student[5];

    public Student[] createArrayOfStudents(Student[] students) {
        students[0] = new Student("Bob", 1);
        students[1] = new Student("Hanna", 2);
        students[2] = new Student("Lily", 3);
        students[3] = new Student("Thomas", 4);
        students[4] = new Student("Theresa", 5);
        return students;
    }

}
