package TestCases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class understatndingAssertions {
	
	@Rule
	public ErrorCollector errorcollector=new ErrorCollector();

	@Test
	public void testFriendlistFacebook(){
		int actual_total_friends=100;
		int expected_total_friends=101;
		
		/*if(actual_total_friends==expected_total_friends){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}*/
		
		System.out.println("A");
		try{
			Assert.assertEquals(expected_total_friends, actual_total_friends);
		}catch (Throwable  e) {
			System.out.println("Error Encountered");
			errorcollector.addError(e);
			//javacode - report error
		}
		System.out.println("B");
		
		try{
			Assert.assertEquals("A", "B");
		}catch (Throwable  e) {
			System.out.println("Error Encountered");
			errorcollector.addError(e);
			//javacode - report error
		}
		
		try{
			Assert.assertEquals("A", "A");
		}catch (Throwable  e) {
			System.out.println("Error Encountered");
			errorcollector.addError(e);
			//javacode - report error
		}
		
		Assert.assertTrue("err msg", 4>3);;
	}
}
