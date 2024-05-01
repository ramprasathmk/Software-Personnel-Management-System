package Employeee.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import Employeee.*;

public class testProject {
	

	@Test
	public void testLogin() {
		Login login = new Login();
		assertNotNull(login);
		login.isActive();
	}
	
	@Test
	public void testHome() {
		Home home = new Home();
		assertNotNull(home);
	}
}

