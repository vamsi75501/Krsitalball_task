package tc_Swaglabs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils_swaglabs.Utils_Class_Swag;

public class Tc004_payment extends Utils_Class_Swag {
	
	
public static Tc004_payment payobj;


JavascriptExecutor js = (JavascriptExecutor)driver;


@FindBy(id="finish")
WebElement finishbutton;

TakesScreenshot ts=(TakesScreenshot)driver;
	
//File trg=new File(".\\Screenshot\\order confirm.png");

	
	public Tc004_payment() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void fullpay() throws InterruptedException, IOException {
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(1000);
		finishbutton.click();
		
		Thread.sleep(3000);
		File sc =ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Image\\order confirm.png");
		FileUtils.copyFile(sc, trg);
		
		
	}
	
	public static Tc004_payment payobj() {
		payobj =new Tc004_payment();
		return payobj;
		
	}

}
