package generic_utility;

public class JavaUtility {
	public static int generateRandomNum() {
		double randomNumber = Math.random()*10000;
		int random = (int) randomNumber;
		return random;
	}
	
}
