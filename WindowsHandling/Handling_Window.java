package WindowsHandling;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Window 
{
	static WebDriver driver;
	
	static WebElement link_privacy;
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
			
		driver.get("https://accounts.google.com/SignUp");
		
		driver.manage().window().maximize();
		
		link_privacy=driver.findElement(By.xpath("//a[text()='Privacy']")); 
		link_privacy.click();		
		
		System.out.println("Parent Window Title is - "+driver.getTitle());
		
		Set<String> win_id=driver.getWindowHandles();
		
		Iterator<String> it = win_id.iterator();
		
		String parentid=it.next();
		
		String childid=it.next();

		driver.switchTo().window(childid);
		
		System.out.println("Child Window Title is - "+driver.getTitle());
		
		Thread.sleep(5000);
		
		//driver.close();
		
		driver.switchTo().window(parentid);
		
		System.out.println("Parent Window Title is - "+driver.getTitle());
		
		//driver.close();
	}
	
}
