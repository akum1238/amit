package Baselibrary;

import java.io.FileInputStream;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Excelutility.Excelutility;

public class Baselibrary_new implements Excelutility
{
	public static WebDriver driver;
	public void getLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit kumar\\eclipse-workspace\\javaprograms\\Automation_Maven_POM\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingbaba.com/old/");
		driver.findElement(By.xpath("//*[text()='×']")).click();
		driver.findElement(By.xpath("//*[text()='Practice']")).click();
	}
	@Override
	public String getReaddata(String path, int sheetno, int colno, int rowno) 
	{
		String value="";
		
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			value =sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e) {
			System.out.println("issue is getreaddata"+e);
			
		}
		return value;
	}
}
