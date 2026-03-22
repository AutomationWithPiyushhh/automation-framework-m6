package testng_extra;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DemoContactTest {

//	whenever we wanna change the order of execution
	
	@Test(priority = -1)
	public void createContactTest() {
		System.out.println("vedi");
	}

	@Test(priority = 0)
	public void modifyContactTest() {
		System.out.println("chaturvedi");
	}

	@Test(priority = 1)
	public void deleteContactTest() {
		System.out.println("trivedi");
	}
}
