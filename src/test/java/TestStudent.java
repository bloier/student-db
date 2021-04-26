import model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {

    Student studentOne = new Student();

    @BeforeEach
    void setUpStudent() {
        studentOne.setName("Bob");
        studentOne.setAge(22);
        studentOne.setSubject("CS");
    }

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
}