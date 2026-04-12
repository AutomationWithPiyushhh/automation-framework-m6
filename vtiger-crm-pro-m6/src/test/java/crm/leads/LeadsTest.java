package crm.leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseutility.BaseClass;

public class LeadsTest extends BaseClass {

	@Test
	public void createLeadsTest() {
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

		Assert.assertTrue(cnStatus);
		Assert.assertTrue(lnStatus);
	}
}
