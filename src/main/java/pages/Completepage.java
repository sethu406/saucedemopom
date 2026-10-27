package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Completepage {

	WebDriver driver;

    public  Completepage(WebDriver driver){

        this.driver=driver;

    }

    By message=By.className("complete-header");

    public String getMessage(){

        return driver.findElement(message).getText();

  

	}

}
