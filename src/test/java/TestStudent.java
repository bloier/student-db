import model.Student;
import model.StudentCreator;
import model.StudentDB;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    Student studentOne = new Student("Bob", 22, "ComputerScience");

    @Test
    public void testNameGetterAndSetter() {
        studentOne.setName("Rufus");
        assertEquals("Rufus", studentOne.getName());
    }

    @Test
    public void testEquals() {
        Student studentTwo = new Student("Greta", 19, "Politics");
        assertFalse(studentOne.equals(studentTwo));
    }

   @Test
    public void testListMethod() {
        //WHEN
        Student[] actualArray = StudentCreator.students;

        //THEN
        assertEquals("[Lmodel.Student;@a09ee92", actualArray);
    }

    /*@Test
    public void testDBToStringMethod() {
        //WHEN

    }*/


}