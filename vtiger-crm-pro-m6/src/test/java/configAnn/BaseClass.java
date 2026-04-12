package configAnn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DB connect + Report config.");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Pre-condition");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Opening Browser");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("closing Browser");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Post-Condition");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("DB disconnect + Rep. backup");
	}

}
