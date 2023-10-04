package concepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotifications_Chrome 
{

	public static void main(String[] args) 
	{
		//Notifications from the Browser
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
				
		ChromeDriver driver = new ChromeDriver(opt);
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String windowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		System.out.println(windowHandles);
		
		List<String> winhan = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winhan.get(1)); //Parent Window --> Flight booking page
		System.out.println(driver.getTitle());
		driver.switchTo().window(winhan.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}

}
