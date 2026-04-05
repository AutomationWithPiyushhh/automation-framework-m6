package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactTest {
	
	
	@Parameters({"bro","un","pwd"})
	@Test(groups = "create")
	public void createContactTest(String browser, String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
//		
////		String browser = "chrome";
//		
//		System.out.println("browser : " + browser) ;
//		System.out.println("username : " + username) ;
//		System.out.println("password : " + password) ;
		
		driver.quit();
	}
	
	@Test(enabled = false)
	public void deleteContactTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
