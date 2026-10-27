package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkoutpage {
	 WebDriver  driver;
	 WebDriverWait wait;
	 

	    public Checkoutpage(WebDriver driver){

	        this.driver=driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    }

	    By first=By.xpath("//*[@id='first-name']");

	    By last=By.id("last-name");

	    By zip=By.id("postal-code");

	    By continueBtn=By.id("continue");

	    public void enterDetails(String fname,String lname,String code){

	    	wait.until(ExpectedConditions.visibilityOfElementLocated(first))
            .sendKeys(fname);

	        driver.findElement(last).sendKeys(lname);

	        driver.findElement(zip).sendKeys(code);

	        driver.findElement(continueBtn).click();

	
	}

}
