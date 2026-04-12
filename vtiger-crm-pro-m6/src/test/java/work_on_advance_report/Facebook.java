package work_on_advance_report;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseutility.BaseClass;
import generic_utility.JavaUtility;

public class Facebook extends BaseClass {

	public ExtentReports report;

	@BeforeSuite
	public void repConfig() {
		String time = JavaUtility.generateDateTime();
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/java/work_on_advance_report/" + time + ".html");
		spark.config().setDocumentTitle("advance_rep_M6");
		spark.config().setReportName("FB report");
		spark.config().setTheme(Theme.STANDARD);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("key1", "value1");
		report.setSystemInfo("key2", "value2");
		report.setSystemInfo("key3", "value3");
	}

	@Test(enabled = false)
	public void loginFB() {
		ExtentTest test = report.createTest("loginFB");
		driver.navigate().to("https://facebook.com/");

		driver.navigate().back();
		test.log(Status.PASS, "Success !!!");
	}

	@Test
	public void loginInsta() {
		ExtentTest test = report.createTest("loginInsta");
		driver.navigate().to("https://instagram.com/");

		driver.navigate().back();
		test.log(Status.SKIP, "skippedddd !!!");
	}

	@Test
	public void loginX() {
		ExtentTest test = report.createTest("loginX");
		driver.navigate().to("https://x.com/");

		TakesScreenshot tks = (TakesScreenshot) driver;
		String ss = tks.getScreenshotAs(OutputType.BASE64);

		test.addScreenCaptureFromBase64String(ss, "failed.png");

		driver.navigate().back();
		test.log(Status.FAIL, "Failed....");
	}

	@AfterSuite
	public void repBackup() {
		report.flush();
	}

}
