package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cartpage {
	WebDriver driver;
	WebDriverWait wait;
	

	public  Cartpage(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	
	By removeProduct=By.id("remove-sauce-labs-backpack");
	By checkoutButton =By.id("checkout");
	public void removeProduct() {
		wait.until( ExpectedConditions.elementToBeClickable(removeProduct)).click();
	}public void checkout() {
		wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
		
	}

}
