package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Expedia {
	
	WebDriver driver;
//	String browserType = "Chrome";
	String User = "standard_user";
	String Pass = "secret_sauce";
	String chechOut = "Mar, 21 Feb 2023";
	
	@Test
	public void hotelReservation() {
//		1. Search / buscar
//		driver.findElement(By.cssSelector("i[title='Alojamientos']")).click();
		driver.findElement(By.id("user-name")).clear();	
		driver.findElement(By.id("user-name")).sendKeys(User);	
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.id("login-button")).click();
		
		String Titulo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
		System.out.println("Products " + Titulo);
//		assertEquals("PRODUCTS", driver.findElements(By.xpath("//*[@id=\"header_container\"]/div[2]/span")));
	
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")), "1");
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//		driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[2]/div/div[2]/div/div/div/div/input")).sendKeys(chechOut);
//		new Select(driver.findElement(By.xpath("sgsrtg"))).selectByValue("5");
		
		sleep(2000);
//		2. Modify the search results page, give criteria / Modificar la página de resultados de búsqueda, dar criterios
//		driver.findElement(By.cssSelector("input[name='star'][id='star4']")).click();
		
//		Strnig hotelName = driver.findElement(By.id("hotel-name”)).getText();
		
//		3. Analyze the results and make our selection / Analizar los resultados y hacer nuestra selección
		
//		driver.findElement(By.xpath("//*[@id=\"resultsContainer\"]/section/artice[" + variable + "]/div[2]/div/a")).click)();
		
//		4. Book reservation / Reservar reserva
		
//		5. Fill out contact / billing / Rellene el contacto / facturación
		
//		6. Get confirmation / Obtener confirmación
	}
	
	@BeforeMethod
	public void setUp() {
//		driver = utilities.DriverFactory.open(browserType); no funciona utilities, porque?
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
