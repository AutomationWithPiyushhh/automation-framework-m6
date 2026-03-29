package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "create")
	public void createOrgTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
	
	@Test
	public void deleteOrgTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
