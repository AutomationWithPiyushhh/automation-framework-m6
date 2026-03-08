package crm.leads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadsTest {
	public static void main(String[] args) throws InterruptedException {
//		browser opening
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		login
		driver.get("http://localhost:8888/");

//		enter username and password 
		WebElement username = driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("user_password"));
		password.sendKeys("password");

//		click on login button
		driver.findElement(By.id("submitButton")).click();

//		create one leads
		
//		click on leads link
		driver.findElement(By.linkText("Leads")).click();

//		click on plus icon
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();

//		fill the form
		String lastName = "Kumar";
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		lastNameField.sendKeys(lastName);

		String compName = "TestYantra";
		WebElement compNameField = driver.findElement(By.name("company"));
		compNameField.sendKeys(compName);

//		save 
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();

//		verification
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		boolean lnStatus = actLastName.equals(lastName);
		
		String actCompName = driver.findElement(By.id("dtlview_Company")).getText();
		boolean cnStatus = actCompName.equals(compName);
		
		if (lnStatus && cnStatus) {
			System.out.println("Leads created successfully!!!");
		} else {
			System.out.println("Failed.....");
		}

		
		
//		logout
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		profile.click();
		driver.findElement(By.linkText("Sign Out")).click();

//		browser closing
		Thread.sleep(3000);
		driver.quit();
	}
}
