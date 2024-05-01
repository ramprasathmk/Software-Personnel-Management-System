package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Employeee.*;

public class testFront_Page {
	

	@Test
	public void testLogin() {
		Login login = new Login();
		assertNotNull(login);
		login.isActive();
	}
	
	@Test
	public void testFrontPage() {
		Front_Page frontpage = new Front_Page();
		assertNotNull(frontpage);
		//frontpage.actionPerformed(null);
	}
	
	@Test
	public void testHome() {
		Home home = new Home();
		assertNotNull(home);
	}
}
