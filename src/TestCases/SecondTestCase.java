package TestCases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestCase {

	public static boolean checklogin(){
		return false;
	}
	@BeforeClass
	public static void begining(){
		System.out.println("**********begining****************");
		Assume.assumeTrue(checklogin());
	}
	@AfterClass
	public static void ending(){
		System.out.println("**********ending****************");
	}
	//browser open
	@Before
	public void OpenBrowser(){
		System.out.println("open the browser");
	}
	@Test
	public void SendEmailTest(){
		System.out.println("Testing send email");
	}
	
	@Test
	public void SendMessageTest(){
		System.out.println("Testing message sending");
	}
	//browser close
	@After
	public void CloseBrowser(){
		System.out.println("close the browser");
	}
}
