package Testingbaba_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary_new;

public class Login_pages extends Baselibrary_new
{
	public Login_pages()
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	
	public void gettile_testingbaba()
	{
		 String title  =driver.getTitle();
		 System.out.println("Testing baba title is "+title);
	}
	
	public void click_element()
	{
		element.click();
	}

}
