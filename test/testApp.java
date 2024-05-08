<<<<<<< HEAD:src/test/testAPP.java
package test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Employeee.*;
public class testAPP {
=======
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Employeee.*;
>>>>>>> d80fc4293cca063a485a873a2797ccad0093aaf1:test/testApp.java

public class testApp {
	@Test
	public void test() {
		assertEquals(1, 1);
	}
	@Test
	public void test0() {
		String res = info.viewInfo();
		assertEquals( "info.ramprasathInfo()", res);
		System.out.println("Passed Test Case: 1");
	}
	@Test
	public void test1() {
		assertNotNull(new Home());
		System.out.println("Passed Test Case: 1");

	}
	@Test
	public void test2() {
		assertNotNull(new Login().isDisplayable());
<<<<<<< HEAD:src/test/testAPP.java
=======
		System.out.println("Passed Test Case: 1");

>>>>>>> d80fc4293cca063a485a873a2797ccad0093aaf1:test/testApp.java
	}
}
