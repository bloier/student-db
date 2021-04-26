import model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student firstStudent = new Student("Susanne", 23, "Physics");
        System.out.println(firstStudent.studentAttributes());

    }
}
