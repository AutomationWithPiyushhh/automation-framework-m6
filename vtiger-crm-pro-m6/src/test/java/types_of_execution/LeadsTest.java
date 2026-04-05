package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LeadsTest {
	@Parameters("bro")
	@Test(groups = "create")
	public void createLeadsTest(String browser) throws InterruptedException {

//		String browser = "chrome";

		WebDriver driver = null;

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		Thread.sleep(5000);

		driver.quit();

	}

	@Test(enabled = false)
	public void deleteLeadsTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.quit();

	}
}
