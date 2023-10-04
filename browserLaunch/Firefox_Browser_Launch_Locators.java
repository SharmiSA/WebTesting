package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser_Launch_Locators 
{
	public static void main(String args[]) throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		//Locators
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//to pass value in a text box we use - Sendkeys
		
		WebElement password = driver.findElement(By.name("password"));
		password.clear(); //to clear already present value in a textbox
		password.sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		
		//How do you verify title of a webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Welcome"))
		{
			System.out.println("I am on a right page");
		}
		else
		{
			System.out.println("I am on a Wrong page");
		}
		driver.close();
		
		
}
}
