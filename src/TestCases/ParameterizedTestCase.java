package TestCases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.omg.CORBA.OBJ_ADAPTER;

//1 step
@RunWith(Parameterized.class)
public class ParameterizedTestCase {
//2 step	
	public String username;
	public String password;
	public int pin;
//3 step	
	public  ParameterizedTestCase(String username, String password, int pin) {
		this.username=username;
		this.password=password;
		this.pin=pin;
	}
//4 step
	@Parameters
	public static Collection<Object[]> getdata(){
		//row - number of times you want to repeat test
		//cols - number of parameters you want to pass
		Object[][] data=new Object[2][3];
		
		data[0][0]="testuser1";
		data[0][1]="pass1";
		data[0][2]=1245;
		
		data[1][0]="testuser2";
		data[1][1]="pass2";
		data[1][2]=3443 ;
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void testRegister(){
		System.out.println("testing Register "+username+"    "+password+"   "+pin);
	}

	/*@Test
	public void testLogin(){
		
	}*/
}
