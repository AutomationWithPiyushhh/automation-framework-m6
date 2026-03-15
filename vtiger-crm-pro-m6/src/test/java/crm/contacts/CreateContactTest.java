package crm.contacts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generic_utility.WebDriverUtility;

public class CreateContactTest {
	public static void main(String[] args) throws InterruptedException {
//		browser opening
		WebDriver driver = new ChromeDriver();
		
		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		wdUtil.maximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		login
		driver.get("http://localhost:8888/");

//		enter username and password 
		WebElement username = driver.findElement(By.name("user_name"));
//					0011 
		
		driver.navigate().refresh();
		
//		re-initialization 
		username = driver.findElement(By.name("user_name"));
//		 1100
		
		username.sendKeys("admin");
//		 1100
		
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("password");

//		click on login button
		driver.findElement(By.id("submitButton")).click();

//		create one contact
//		click on contacts link
		driver.findElement(By.linkText("Contacts")).click();

//		click on plus icon
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();

//		fill the form
		String lastName = "Sharma";
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		lastNameField.sendKeys(lastName);

//		save 
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();

//		verification
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		boolean status = actLastName.equals(lastName);
		if (status) {
			System.out.println("Contact created successfully!!!");
		} else {
			System.out.println("Failed.....");
		}

//		logout
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

		wdUtil.hover(profile);

		driver.findElement(By.linkText("Sign Out")).click();

//		browser closing
		Thread.sleep(3000);
		driver.quit();
	}
}
