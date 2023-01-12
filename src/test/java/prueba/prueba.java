package prueba;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prueba {
	private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

//	@SuppressWarnings("deprecation")
	@Test
	public void testGooglePage() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		sleep(2000);
		assertEquals("Products", driver.findElements(By.id("//div[@id='header_container']//span[@class='title']")));	
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
