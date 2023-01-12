package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;

	public String CONFIRMACION() {
		return driver.findElement(By.xpath("//*[@id=\"globalMessages\"]/div/div")).getText();
	}
	
	public String Title() {
		return driver.getTitle();
	}
	
	public void BuscarTVs() {
		driver.findElement(By.id("SmartMainBarComponent")).click();
	}
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
}
