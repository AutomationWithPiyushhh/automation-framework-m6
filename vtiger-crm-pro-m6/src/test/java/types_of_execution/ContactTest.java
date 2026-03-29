package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "create")
	public void createContactTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	@Test
	public void deleteContactTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
