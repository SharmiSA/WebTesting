package WindowsHandling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling
{
	static WebDriver driver;
	
	static WebElement link_privacy;
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		 
			
			driver.get("https://accounts.google.com/SignUp");
			
			driver.manage().window().maximize();
			
			link_privacy=driver.findElement(By.xpath("//a[text()='Privacy']"));  //Learn more link
			link_privacy.click();
			
			
			//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
			
			System.out.println("Parent Window Title is - "+driver.getTitle());
			
			Set<String> set = driver.getWindowHandles();
			
			while (set.size() != 2) 
			{
				Thread.sleep(2000);
				
				set = driver.getWindowHandles();
			} 
			
			String parentid=set.toArray()[0].toString();
			
			System.out.println("Parent Window ID is: "+ parentid);
			
			String childid=set.toArray()[1].toString();
			
			System.out.println("Child Window ID is: "+ childid); 
			
			driver = driver.switchTo().window(childid);
			
			//driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
					
			System.out.println("Child Window Title is - "+driver.getTitle());
			
			/*WebElement lnk_name = driver.findElement(By.linkText("Name"));
			
			lnk_name.click();*/
			
			Thread.sleep(5000);
			
			
			//Back to Parent Window
			driver = driver.switchTo().window(parentid);
			
			System.out.println("Parent Window Title is - "+driver.getTitle());
			
			driver.quit();
	}
}
