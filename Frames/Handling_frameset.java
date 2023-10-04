package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_frameset 
{
	//Frameset
	static WebDriver driver;
	
	static WebElement SecureID,Btn_login,txtbox_pwd,Btn_cntnue,txtbox_cust_id;

	public static void main(String[] args)
	{
		 ChromeOptions options = new ChromeOptions();
		 
		 options.addArguments("--disable-notifications");
     	 
		 //options.addArguments("--remote-allow-origins=*");
 
		 WebDriver driver = new ChromeDriver(options);
		 
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		System.out.println("Frame count is: "+driver.findElements(By.tagName("frame")).size());
		
	    driver.switchTo().frame("login_page");
	    
		//driver.switchTo().frame(driver.findElements(By.tagName("frame")).get(0).getAttribute("name"));
	    try
	    {
	    	txtbox_cust_id=driver.findElement(By.xpath(".//input[@name='fldLoginUserId']"));
			txtbox_cust_id.sendKeys("40466689");
			
			Btn_cntnue=driver.findElement(By.xpath("//a[text()='CONTINUE']"));
			Btn_cntnue.click();
			
			txtbox_pwd=driver.findElement(By.xpath(".//input[@id='fldPasswordDispId']"));
			txtbox_pwd.sendKeys("0709");
			
			SecureID=driver.findElement(By.xpath("//input[@name='chkrsastu']"));
			SecureID.click();
			
			Btn_login=driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
			Btn_login.click();
			
			System.out.println(driver.switchTo().alert().getText());
			// Get the message of alert pop up 
			driver.switchTo().alert().accept();
			
			driver.switchTo().defaultContent();	
			driver.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
				
	   	
	}
}