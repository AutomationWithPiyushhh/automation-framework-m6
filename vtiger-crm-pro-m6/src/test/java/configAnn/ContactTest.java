package configAnn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactTest extends BaseClass{
	
	@Test
	public void createContactTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}