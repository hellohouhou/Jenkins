import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReadFromFileTest {

	private static ReadFromFile file = new ReadFromFile();
	@Test
	void testReadFromCsv() {

		file.readFromCsv("C:/task.csv");
	}

	@Test
	void testGetRow() {

		assertEquals("4,ddd,2018/11/16", file.getRow("C:/task.csv", 4));
		
		assertEquals("6,fff,2018/11/18", file.getRow("C:/task.csv", 6));
	}
	
	public static void main(String[] args) {
		
		ReadFromFileTest test1 = new ReadFromFileTest();
		
		test1.testReadFromCsv();
		test1.testGetRow();
	}

}
