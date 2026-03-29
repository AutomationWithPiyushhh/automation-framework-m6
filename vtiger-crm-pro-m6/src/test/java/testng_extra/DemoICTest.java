package testng_extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoICTest {

//	ic => to execute same testscript multiple times,
//		  with the same set of data, we go for ic
	
//	dp => to execute same testscript multiple times,
//		  with the different set of data, we go for dp
	
	
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void createContactTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("cct executed");
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(enabled = false)
	public void modifyContactTest() {
		WebDriver driver = new ChromeDriver();
		System.out.println("mct executed");
		driver.quit();
	}

	@Test(enabled = false)
	public void deleteContactTest() {
		WebDriver driver = new ChromeDriver();
		System.out.println("dct executed");
		driver.quit();
	}
}
