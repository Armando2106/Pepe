package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import page.DashboardPage;
import page.LoginPage;
import utils.utilities;


public class Login extends utilities {
	String pass = "qwer1254";
	WebDriver driver;
	
	@Test
	public void loginTestPOM() {
		
		driver = web ();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setNombre("Martin");
		loginPage.setApellido("Correa");
		loginPage.setPostal("1057");
		loginPage.setMail("correamartin4188@gmail.com");
		loginPage.setContraseña(pass);
		loginPage.setContraseña2(pass);
		loginPage.setCrearSubmit();
		
		
		DashboardPage dashboardPage = new DashboardPage(driver);
		String conf = dashboardPage.CONFIRMACION();
		String Title = dashboardPage.Title();
//		System.out.println(conf + Title);
		Assert.assertTrue(conf.contains("¡Te registraste exitosamente!"));
		Assert.assertTrue(Title.contains("Musimundo"));
		
		dashboardPage.BuscarTVs();
		
		driver.quit();
	}

}
