package checkLinks;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckLinksTest {
	WebDriver driver;
	CheckingLinksPage page;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		page = new CheckingLinksPage(driver);
//		driver.manage().window().maximize();
		driver.get("https://www.decolar.com/");
		
	}
	
	@Test
	public void CheckingLinks() {
		assertTrue(page.CheckingPageLinks(),"There are broken links");
	}
	
	@AfterMethod
	public void afterClass() {
		driver.quit();
	}
	
	
}
