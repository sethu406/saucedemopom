package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overviewpage {
	WebDriver driver;

    public  Overviewpage(WebDriver driver){

        this.driver=driver;

    }

    By finish=By.id("finish");

    public void finishOrder(){

        driver.findElement(finish).click();

	
	}

}
