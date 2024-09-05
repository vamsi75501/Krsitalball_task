package testCase_Swag;

import org.testng.annotations.Test;


import base_Class_Swag.Baseclass_swaglabs;
import tc_Swaglabs.Tc001_login;
import tc_Swaglabs.Tc002_purchase;
import tc_Swaglabs.Tc003_checkout_info;
import tc_Swaglabs.Tc004_payment;
import tc_Swaglabs.Tc005_Logout;


public class Testcase_SL extends Baseclass_swaglabs {
	
	@Test
	public void swaglab() throws Exception   {
		// TODO Auto-generated method stub
		
		//Tc01
		
		Tc001_login.loginobj().loginpage();
		System.out.println("LOGIN SUCCESSFULLY");
		
		//Tc02
		Tc002_purchase.pg2obj().Categories();
		System.out.println("ADD CART SUCESSFULLY");
		
		//Tc03
		 Tc003_checkout_info.infoobj().detail();
		 System.out.println("DETAIL ADD SUCCESSFULLY");
		 
		//Tc04
		 Tc004_payment.payobj().fullpay();
		 System.out.println("ORDER SUCCESSFULLY");
		 
		 //Tc05
		 Tc005_Logout.outobj().logout();;
		 System.out.println("LOGOUT SUCCESSFULLY");
		

}
}