package generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {
	public static int generateRandomNum() {
		double randomNumber = Math.random() * 10000;
		int random = (int) randomNumber;
		return random;
	}

	public static String generateDateTime() {		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");
		
		String time = dtf.format(now);
		return time;
	}
}
