package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject {
	
	@FindBy(xpath = "//div[@id='header_container']//span[@class='title']")
	private WebElement products_label;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement addToCart_SauceBackpack;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement car_badge;
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle() {
		return this.products_label.getText();
	}
	
	public void addToCarBackpack() {
		this.addToCart_SauceBackpack.click();
	}
	
	public String getCardBadge() {
		return this.car_badge.getText();
	}
}