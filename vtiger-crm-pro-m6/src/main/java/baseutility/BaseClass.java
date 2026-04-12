package baseutility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generic_utility.WebDriverUtility;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBro() {
		driver = new ChromeDriver(); // Test steps
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void login() {
		driver.get("http://localhost:8888/");

		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("password");

		driver.findElement(By.id("submitButton")).click();
	}

	@AfterMethod
	public void logout() {
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		wdUtil.hover(profile);
		driver.findElement(By.linkText("Sign Out")).click();
	}

	@AfterClass
	public void closeBro() {
		driver.quit();
	}
}
