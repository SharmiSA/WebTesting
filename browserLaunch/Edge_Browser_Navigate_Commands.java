package browserLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Browser_Navigate_Commands 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
			
		driver.manage().window().maximize(); ///Maximize the Screen
	
		driver.navigate().to("https://demo.guru99.com/test/newtours//"); //Launching URL using Navigate command
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("SUPPORT")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		
		driver.close();	
	}
}
