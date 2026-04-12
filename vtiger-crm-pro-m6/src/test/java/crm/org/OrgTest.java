package crm.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseutility.BaseClass;
import generic_utility.FileUtility;
import generic_utility.JavaUtility;

public class OrgTest extends BaseClass {

	@Test
	public void createOrgTest() throws IOException{
		FileUtility fUtil = new FileUtility();

//		create one organization
//		click on org link
		driver.findElement(By.linkText("Organizations")).click();

//		click on plus icon
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();

//		fill the form		
//		String orgName = "Qspiders_" + random;

		String orgName = fUtil.getDataFromExcelFile("org", 2, 0) + JavaUtility.generateRandomNum();

		WebElement orgField = driver.findElement(By.name("accountname"));
		orgField.sendKeys(orgName);

//		save 
		driver.findElement(By.cssSelector("input[title='Save [Alt+S]']")).click();

//		verification
		String actOrgName = driver.findElement(By.id("dtlview_Organization Name")).getText();
		boolean status = actOrgName.equals(orgName);

		Assert.assertTrue(status);
	}
}
