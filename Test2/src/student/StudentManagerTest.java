package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {
	
	StudentManager student;

	@BeforeEach
	void setUp() {
		student = new StudentManager();
	}

	@Test
	void testAddStudent() {
		student.addStudent("홍길동");
		assertTrue(student.hasStudent("홍길동"));
	}

	@Test
	void testRemoveStudent() {
		student.addStudent("홍길동");
		student.removeStudent("홍길동");
		assertFalse(student.hasStudent("홍길동"));
	}
	
	@Test
	void testAddStudentException() {
		student.addStudent("홍길동");
		assertThrows(IllegalArgumentException.class, () -> {
			student.addStudent("홍길동");
        });
	}
	
	@Test
	void testRemoveStudentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			student.removeStudent("홍길동");
        });
	}

}
