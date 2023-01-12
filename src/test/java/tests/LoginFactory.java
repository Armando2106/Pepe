package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.LoginPageFactory;

@Test
public class LoginFactory {
	WebDriver driver;
	
	String nombre = "Martinez";
	String apellido = "Correa";
	String postal = "1057";
	String mail = "corremartin4884@gmail.com";
	String contraseña = "qwer1254";
	String contraseña2 = "qwer1254";
	
	public void loginTestPageFactory() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.musimundo.com/login");
		
		
		LoginPageFactory loginPage = new LoginPageFactory (driver);
		loginPage.login(nombre, apellido, postal, mail, contraseña, contraseña2);
		
		
		driver.quit();
	}

}
