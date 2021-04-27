import model.Student;
import model.StudentCreator;
import model.StudentDB;

public class AppMain {
    public static void main(String[] args) {
        Student firstStudent = new Student("Susanne", 23, "Physics");
        //System.out.println(firstStudent.toString());

        StudentCreator studentCreator = new StudentCreator();
        Student[] students = studentCreator.createArrayOfStudents();
        StudentDB studentDatabase = new StudentDB(students);

        System.out.println(studentDatabase.randomStudent());
        System.out.println();
        System.out.println(studentDatabase.toString());
        System.out.println(studentDatabase.list());

    }
}
