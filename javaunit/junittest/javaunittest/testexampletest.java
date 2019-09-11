package javaunittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testexampletest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testADDInts() {
	//	fail("Not yet implemented");
		int x=1;
		int y=2;
		testexample test1=new testexample();
		int result=test1.ADDInts(x, y);
		assertEquals(3,result);
	}

}
