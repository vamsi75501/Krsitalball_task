package tc_Swaglabs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils_swaglabs.Utils_Class_Swag;

public class Tc002_purchase extends Utils_Class_Swag {

	public static Tc002_purchase pg2obj;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	@FindBy(linkText="Sauce Labs Onesie")
	WebElement  shirt;
	
	
	@FindBy(xpath="//button[@name='add-to-cart']")
	WebElement  cart;
	

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement  Addcart;
	
	
	@FindBy(id="checkout")
	WebElement  checkout;
	
	
	
	public Tc002_purchase() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	public void Categories() throws InterruptedException {
		Thread.sleep(1000);
		
	    js.executeScript("window.scrollBy(0,5000)");
	    
	   shirt.click();
	   
	   cart.click();
	   
	   Thread.sleep(1000);
	   Addcart.click();
	   
	   checkout.click();
	    
	}
	
	
	public static  Tc002_purchase  pg2obj(){
		pg2obj=new Tc002_purchase();
		return pg2obj;
		
		
		
	}
	
}
