package work_on_advance_report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Facebook {
	@Test
	public void loginFB() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/java/work_on_advance_report/dummy.html");
		spark.config().setDocumentTitle("advance_rep_M6");
		spark.config().setReportName("FB report");
		spark.config().setTheme(Theme.STANDARD);

		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("key1", "value1");
		report.setSystemInfo("key2", "value2");
		report.setSystemInfo("key3", "value3");

		ExtentTest test = report.createTest("Randommmmm");
		
		test.log(Status.PASS, "Success !!!");
		test.log(Status.WARNING, "warnnnnn !!!");
//		test.log(Status.SKIP, "skippedddd !!!");
		test.log(Status.INFO, "information");
//		test.log(Status.FAIL, "Failed....");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.quit();

		report.flush();
	}
}
