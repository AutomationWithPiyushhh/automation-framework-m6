package testng_extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

//	priority => whenever we wanna change the order of execution

	@Test(priority = -1)
	public void createContactTest() {
		System.out.println("smallNoida");
	}

	@Test(priority = 0)
	public void modifyContactTest() {
		System.out.println("smartNoida");

		String str1 = "abc";
		String str2 = "abc";
		String str3 = "xyz";

		Assert.assertTrue(str1.equals(str3));
	}

	@Test(priority = 1)
	public void deleteContactTest() {
		System.out.println("deleteSmartNoida");
	}
}
