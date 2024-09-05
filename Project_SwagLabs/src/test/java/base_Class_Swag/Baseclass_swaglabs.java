package base_Class_Swag;


import org.testng.annotations.BeforeMethod;

import utils_swaglabs.Utils_Class_Swag;

public class Baseclass_swaglabs extends Utils_Class_Swag {
	
	@BeforeMethod
	public void browserlaunch() {
		// TODO Auto-generated method stub
		
		browserlaunch("chrome");
		driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
	}

//	@AfterMethod
//	public void browserclose() 	{
//		
//	// TODO Auto-generated method stub
//driver.close();
//	}
	
	
	

			}
	
	


