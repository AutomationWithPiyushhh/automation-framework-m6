package testng_extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDOMTest {

//	DOM => whenever we wanna change the order of execution, 
//			with correct flow or logic
//	whenever we wanna create dependency between 2 test cases...

	@Test
	public void createContactTest() {
		System.out.println("create smallNoida");
	}

	@Test(dependsOnMethods = "createContactTest")
	public void modifyContactTest() {
		System.out.println("create smallNoida");

		System.out.println("smartNoida");

		String str1 = "abc";
		String str2 = "abc";
		String str3 = "xyz";

		Assert.assertTrue(str1.equals(str3));
	}

	@Test(dependsOnMethods = "modifyContactTest", alwaysRun = true)
	public void deleteContactTest() {
		System.out.println("deleteSmartNoida");
	}
}
