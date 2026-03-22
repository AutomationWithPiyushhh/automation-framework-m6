package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
//		create jro of the physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");

//		by using load(), load all the keys
		Properties pObj = new Properties();
		pObj.load(fis);

//		by using getProperty("key"), get the value
		String browser = pObj.getProperty("bro");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("un");
		String PASSWORD = pObj.getProperty("pwd");
		System.out.println(browser);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
