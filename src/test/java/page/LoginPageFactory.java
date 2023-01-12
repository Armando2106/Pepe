package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;

	@FindBy(id="register.firstName")
	WebElement nombreBox;
	
	@FindBy(id="register.lastName")
	WebElement apellidoBox;
	
	@FindBy(id="register.zipCode")
	WebElement postalBox;
	
	@FindBy(id="register.email")
	WebElement mailBox;
	
	@FindBy(id="register.pwd")
	WebElement contraseñaBox;
	
	@FindBy(id="register.checkPwd")
	WebElement contraseña2Box;
	
	@FindBy(name="registerButton")
	WebElement loginButton;
	
	
	public void setNombre(String nombre) {
		nombreBox.sendKeys(nombre);
	}
	
	public void setApellido(String apellido) {
		apellidoBox.sendKeys(apellido);
	}
	
	public void setPostal(String postal) {
		postalBox.sendKeys(postal);
	}
	
	public void setMail(String mail){
		mailBox.sendKeys(mail);
	}
	
	public void setContraseña(String contraseña) {
		contraseñaBox.sendKeys(contraseña);
	}
	
	public void setContraseña2(String contraseña2) {
		contraseña2Box.sendKeys(contraseña2);
	}
	
	public void CrearSubmit() {
		loginButton.click();
	}
	
	
	public void login(String nombre, String apellido, String postal, String mail, String contraseña, String contraseña2) {
		setNombre(nombre);
		setApellido(apellido);
		setPostal(postal);
		setMail(mail);
		setContraseña(contraseña);
		setContraseña2(contraseña2);
		CrearSubmit();
	}
	
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
