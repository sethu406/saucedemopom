package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productspage {

	 WebDriver driver;

	    public  Productspage(WebDriver driver){

	        this.driver=driver;

	    }

	    By bag=By.id("add-to-cart-sauce-labs-backpack");

	    By bike=By.id("add-to-cart-sauce-labs-bike-light");

	    By cart=By.className("shopping_cart_link");

	    public void addProducts(){

	        driver.findElement(bag).click();

	        driver.findElement(bike).click();

	    }

	    public void openCart(){

	        driver.findElement(cart).click();
	}

}
