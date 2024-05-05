package Testingbaba_Pages;


import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrary_new;

public class Check_box extends Baselibrary_new
{
	public Check_box()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element1;
	@FindBy(xpath = "//a[@href=\"#tab_2\"]")
	private WebElement check_box;
	@FindBy(xpath = "//*[text()='Mobile:']")
	private WebElement mobile;
	@FindBy(xpath = "//*[text()='Laptop:']")
	private WebElement laptop;
	@FindBy(xpath = "//*[text()='Desktop:']" )
	private WebElement desktop;
	
	public void click_element()
	{
		element1.click();
	}
	
	public void Click_checkbox()
	{
		check_box.click();
	}
	public void Click_mobile()
	{
		mobile.click();
	}
	
	public void Click_laptop()
	{
		laptop.click();
	}
	
	public void Click_destop()
	{
		desktop.click();
	}

}
