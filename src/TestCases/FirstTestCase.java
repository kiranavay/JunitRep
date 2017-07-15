package TestCases;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {

	@Test
	public void xyztest(){
		System.out.println("Test an application");
	}
	
	@Ignore
	@Test
	public void logintest(){
		System.out.println("login test");
	}
	
	@Test
	public void registertest(){
		System.out.println("register a user");
	}
	
	@Test
	public void databasetest(){
		System.out.println("Test the database");
	}
}
