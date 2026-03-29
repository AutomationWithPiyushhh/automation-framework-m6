package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OppTest {
	@Test(groups = "create")
	public void createOppTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
	
	@Test
	public void deleteOppTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}
