package saucedemo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestPlan {
	private static final WebDriver driver = new ChromeDriver();
	
	@BeforeSuite
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
		
		driver.manage().window().maximize();
		driver.get(Utils.BASE_URL);
	}
	
//	(testName = "Login successfully")
	@Test
	public static void loginSuccessfully() {
		driver.get(Utils.BASE_URL);
		LoginForm loginForm = new LoginForm(driver);
		loginForm.enterUsername();
		loginForm.enterPassword();
		loginForm.pressLoginButton();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ProductsPage productsPage = new ProductsPage(driver);
		Assert.assertEquals(productsPage.getTitle(), "PRODUCTS");
	}
	
//	(testName = "Login successfully")
	@Test
	public static void verifyItemAdded() {
		driver.get(Utils.BASE_URL);
		LoginForm loginForm = new LoginForm(driver);
		loginForm.enterUsername();
		loginForm.enterPassword();
		loginForm.pressLoginButton();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.addToCarBackpack();
		Assert.assertEquals(productsPage.getCardBadge(), "1");

	}
	
	@AfterSuite
	public static void cleanUp() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
