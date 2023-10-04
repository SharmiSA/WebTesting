package WindowsHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones", Keys.ENTER);
		
		//gets the address of the current opened active window
		//windowhandle - handles single opened window and its return type is String
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.xpath("//span[text()='IKALL Z19 Pro Ultra Smartphone (6.5 Inch HD+ Display, 6GB, 128GB) (Blue)']")).click();
		
		//gets the address of all the opened active window
		//windowhandles - handles multiple opened window and its return type is Set
		// windowhandles - there will not be any duplicates so using set for window handling
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		System.out.println(windowHandles);
		
		List<String> winhan = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(winhan.get(0));// 0-->parent window -->current active window
		driver.switchTo().window(winhan.get(1));// 1-->child window --> active window
		
		String Prodtitle = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		System.out.println(Prodtitle);
		
		// Explain the scenario with multiple window-->where you need to close the
				// parent window except the child window
				/*
				 * driver.switchTo().window(winhan.get(0));
				 * System.out.println(driver.getTitle()); driver.close();
				 */
		// Explain the scenario with multiple window-->where you need to close all the
				// child window except parent window
				driver.switchTo().window(winhan.get(1));
				
				System.out.println(driver.getTitle());
				
				// driver.close();//closes the current active window
				
				driver.switchTo().window(winhan.get(0));
				System.out.println(driver.getTitle());
				
				//driver.quit();// closes all the opened window by the browser
		
		for (String string : windowHandles)
		{
			System.out.println("Title of each window opened: " + driver.getTitle());
			driver.switchTo().window(windowHandle);
		}
		driver.quit();
	}

}
