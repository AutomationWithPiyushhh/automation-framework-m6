package testng_extra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoForDPTest {

	@Test(dataProvider =  "getData")
	public void fbLogin(String username, String password) {

//		String username = "admin";
//		String password = "admin@123";
		
		System.out.println(username + " : " + password);
		
//		https://www.saucedemo.com/
	}
	
	@DataProvider
	public String[][] getData() {
		String [][] cred = new String[4][2];
//								  row 		column
//							no. of exe    no. of data

		cred [0][0] = "abhishek";
		cred [0][1] = "abhi@123";	

		cred [1][0] = "pradeep";
		cred [1][1] = "Qwerty@pradeep";	

		cred [2][0] = "saloni";
		cred [2][1] = "saloni@999";	

		cred [3][0] = "yuvraj";
		cred [3][1] = "yuvraj@121";	
		
		return cred;
	}
	
}
