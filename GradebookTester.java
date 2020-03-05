import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	GradeBook gb1, gb2;
	
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(65.9);
		gb1.addScore(88.09);
		gb1.addScore(100);
		gb1.addScore(92.1);
		gb1.addScore(0);
		
		gb2.addScore(54);
		gb2.addScore(99.99);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = gb2 = null;
	}

	@Test
	public void testAddScore() {
		assertEquals(gb1.getScoreSize(), 5);
		assertEquals(gb2.getScoreSize(), 2);
	}
	@Test
	public void testSum() {
		assertEquals(gb1.sum(), 346.09, 0.01);
		assertEquals(gb2.sum(), 153.99, 0.01);
	}
	@Test
	public void testMinimum() {
		assertEquals(gb1.minimum(), 0, 0.01);
		assertEquals(gb2.minimum(), 54, 0.01);
	}
	@Test
	public void testFinal() {
		assertEquals(gb1.finalScore(), 346.09, 0.01);
		assertEquals(gb2.finalScore(), 99.99, 0.01);
	}
}