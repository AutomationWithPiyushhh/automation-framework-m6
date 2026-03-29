package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeadsTest {
	@Test(groups = "create")
	public void createLeadsTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
	
	@Test
	public void deleteLeadsTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
