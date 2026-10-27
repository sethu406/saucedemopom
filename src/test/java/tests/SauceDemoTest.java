package tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Cartpage;
import pages.Checkoutpage;
import pages.Completepage;
import pages.Loginpage;
import pages.Overviewpage;
import pages.Productspage;

 public class SauceDemoTest  extends BaseClass{

	@BeforeMethod
    public void start() throws MalformedURLException {

		setup();}

   
@Test

public void orderTest(){

    Loginpage login=new Loginpage(driver);

    login.login("standard_user","secret_sauce");

    Productspage product=new Productspage(driver);

    product.addProducts();

    product.openCart();

    Cartpage cart=new Cartpage(driver);

    cart.removeProduct();

    cart.checkout();

    Checkoutpage check=new Checkoutpage(driver);

    check.enterDetails("Rasmi","PV","682001");

    Overviewpage overview=new Overviewpage(driver);

    overview.finishOrder();

    Completepage complete=new Completepage(driver);

    String actual=complete.getMessage();

    Assert.assertEquals(actual,"Thank you for your order!");

}

@AfterMethod

public void close(){

    tearDown();
	
}

}
