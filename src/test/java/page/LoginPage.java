package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public void setNombre(String nombre) {
		driver.findElement(By.id("register.firstName")).sendKeys(nombre);
	}
	
	public void setApellido(String apellido) {
		driver.findElement(By.id("register.lastName")).sendKeys(apellido);
	}
	
	public void setPostal(String postal) {
		driver.findElement(By.id("register.zipCode")).sendKeys(postal);
	}
	
	public void setMail(String mail){
		driver.findElement(By.id("register.email")).sendKeys(mail);
	}
	
	public void setContraseña(String contraseña) {
		driver.findElement(By.id("register.pwd")).sendKeys(contraseña);
	}
	
	public void setContraseña2(String contraseña2) {
		driver.findElement(By.id("register.checkPwd")).sendKeys(contraseña2);
	}
	
	public void setCrearSubmit() {
		driver.findElement(By.xpath("//*[@id=\"registerForm\"]/div[2]/button")).click();
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
}
