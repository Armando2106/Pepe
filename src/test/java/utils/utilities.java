package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilities {
	
	static WebDriver driver;
	
	public static WebDriver web (){
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.musimundo.com/login");
	return driver;
//	
	}
}
