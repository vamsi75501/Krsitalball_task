package tc_Swaglabs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_swaglabs.Utils_Class_Swag;

public class Tc003_checkout_info extends Utils_Class_Swag {
	
	public static Tc003_checkout_info infoobj;
	
JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	
	@FindBy(id="last-name")
	WebElement  secondname;
	

	@FindBy(id="postal-code")
	WebElement pincode;
	
	
	@FindBy(id="continue")
	WebElement button;
	
	

	
	
	public Tc003_checkout_info() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	public void detail() throws InterruptedException {
		Thread.sleep(1000);
		
	    js.executeScript("window.scrollBy(0,4000)");
	    
	    Thread.sleep(1000);
	    
	    firstname.sendKeys("v.siva");
	    secondname.sendKeys("kumar");
	    pincode.sendKeys("600037");
	   button.click();
	    
	}
	
	
	public static  Tc003_checkout_info  infoobj(){
		infoobj=new Tc003_checkout_info();
		return infoobj;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
