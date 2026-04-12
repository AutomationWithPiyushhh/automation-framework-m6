package crm.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseutility.BaseClass;

public class ContactTest extends BaseClass { // TestNG class

	@Test
	public void createContactTest() throws InterruptedException { // Test Case

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

		Assert.assertTrue(status); // if failed => AssertionError

	}

}
