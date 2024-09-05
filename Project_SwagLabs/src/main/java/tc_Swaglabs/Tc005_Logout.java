package tc_Swaglabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_swaglabs.Utils_Class_Swag;

public class Tc005_Logout extends Utils_Class_Swag {
	
	public static Tc005_Logout  outobj;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement  Button;

	@FindBy(linkText="Logout")
	WebElement  logoutbut;
	
		
	public Tc005_Logout() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws InterruptedException {
		
		Button.click();
		Thread.sleep(2000);
		logoutbut.click();
		
		
	}
	
	public static Tc005_Logout outobj() {
		outobj =new Tc005_Logout();
		return outobj;
		
	}
	
	
	
	
	
	
	
	
	

}
