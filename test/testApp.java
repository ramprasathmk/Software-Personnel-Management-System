import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Employeee.*;

class testApp {
	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
	@Test
	public void test0() {
		String res = info.viewInfo();
		assertEquals( "info.ramprasathInfo()", res);
	}
	
	@Test
	public void test1() {
		assertNotNull(new Home());
	}
	
	@Test
	public void test2() {
		assertNotNull(new Login().isDisplayable());
	}
}
