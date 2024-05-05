package Testingbaba_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary_new;
import Testingbaba_Pages.Login_pages;

public class Login_test extends Baselibrary_new
{
	Login_pages ob;
	
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunch();
		ob = new Login_pages();
	}
	
	@Test(priority = 1)
	public void getTitle()
	{
		ob.gettile_testingbaba();
	}
	
	@Test(priority = 2)
	public void elements()
	{
		ob.click_element();
	}

}
