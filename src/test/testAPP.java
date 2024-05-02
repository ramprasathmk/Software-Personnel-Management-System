package test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Employeee.*;
public class testAPP {

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
