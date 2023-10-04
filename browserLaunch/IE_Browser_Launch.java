package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser_Launch 
{
	public static void main(String args[]) throws InterruptedException
	{
			
		System.setProperty("webdriver.ie.driver", "D:\\TCS_Selenium_Practice\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
			
		//Maximize the Screen
		driver.manage().window().maximize();
						
		//To launch URL
		driver.get("http://demo.guru99.com/test/newtours/index.php");
							
		System.out.println("Newtours Application Launched Successfully in Internet Explorer Browser(Driver)");
						
		//To close the current browser
		driver.close();
						
		//To close all the browser
		driver.quit();	
		}
}
