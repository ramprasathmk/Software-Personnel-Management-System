package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Employeee.*;

class testAPP {

	@Test
	void test() {
		assertEquals(1, 1);
	}

	@Test
	void test1() {
		assertNotNull(new Login().isDisplayable());
	}
	
	@Test
	void test2() {
		assertNotNull(new Home());
	}	
}
