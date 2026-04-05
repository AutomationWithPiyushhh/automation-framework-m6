package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertion {
	@Test
	public void nullNotNull() {
		Object obj1 = null;
		Object obj2 = new Object();

		Assert.assertNull(obj2);
		Assert.assertNotNull(obj1);
	}
}
