package Testingbaba_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary_new;
import Testingbaba_Pages.Check_box;

public class Check_box_test extends Baselibrary_new
{
	Check_box ob;
	
	@BeforeTest
	public void getLaunch2()
	{
		getLaunch();
		ob = new Check_box();
	}
	@Test (priority = 1)
	public void element()
	{
		ob.click_element();
	}
	@Test (priority = 2)
	public void checkbox()
	{
		ob.Click_checkbox();
	}
	
	@Test (priority = 3)
	public void mobile()
	{
		ob.Click_mobile();
	}
	
	@Test (priority = 4)
	public void laptop()
	{
		ob.Click_laptop();
	}
	
	@Test (priority = 5)
	public void desktop()
	{
		ob.Click_destop();
		
	}
}
