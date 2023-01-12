package mosimundo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	
	WebDriver driver;
	String nombre = "Armando";
	String apellido = "Campo";
	String postal = "1057";
	String mail = "armando.campo.295@gmail.com";
	String pass = "qwer1454";
	
//	
	@Test(priority = 1)
	public void Registro() {
		driver.findElement(By.id("register.firstName")).sendKeys(nombre);
		driver.findElement(By.id("register.lastName")).sendKeys(apellido);
		driver.findElement(By.id("register.zipCode")).sendKeys(postal);
		driver.findElement(By.id("register.email")).sendKeys(mail);
		driver.findElement(By.id("register.pwd")).sendKeys(pass);
		driver.findElement(By.id("register.checkPwd")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[2]/button")).click();
		

		
		String conf = driver.findElement(By.xpath("//*[@id=\"globalMessages\"]/div/div")).getText();				
		if(conf == "¡Te registraste exitosamente!" ) {
			System.out.println("CONFIRMACION: " + conf);
		}else {
			String denegado = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div")).getText();
			System.out.println("CONFIRMACION: " + denegado);
		}
				

					
				
		driver.findElement(By.id("SmartMainBarComponent")).click();
		driver.findElement(By.xpath("//*[@id=\"addToCartForm00490005\"]/button")).click();
		sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div/div[3]/div/div[1]/div[2]/a[2]")).click();
	}
	
	
	
//	(enabled = false
	@Test(enabled = false)
	public void userExistente() {
		driver.findElement(By.id("j_username")).sendKeys(mail);
		driver.findElement(By.id("j_password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/button")).click();
		
		driver.findElement(By.id("CelularesMainBarComponent")).click();
		driver.findElement(By.xpath("//*[@id=\"addToCartForm00490005\"]/button")).click();
		sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div/div[3]/div/div[1]/div[2]/a[2]")).click();
	}
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.musimundo.com/login");
		
	}

	@AfterMethod
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
