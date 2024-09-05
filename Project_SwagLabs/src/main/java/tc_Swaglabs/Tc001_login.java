package tc_Swaglabs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_swaglabs.Utils_Class_Swag;

public class Tc001_login extends Utils_Class_Swag {
	
	
	public static Tc001_login loginobj;
	
	@FindBy(name="user-name")
	WebElement  username;

	@FindBy(name="password")
	WebElement  password;
	
	@FindBy(name="login-button")
	WebElement loginbutton;
	
	public Tc001_login() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void loginpage() throws InterruptedException {
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginbutton.click();
		
		
	}
	
	public static Tc001_login loginobj() {
		loginobj =new Tc001_login();
		return loginobj;
		
	}
	
}
