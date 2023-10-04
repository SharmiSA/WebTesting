package AlertsPopupsImplicitFluentWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertsAndPopup 
{
			public static WebDriver driver;
			public static WebElement SimpleAlert;
			
			public static void main(String[] args) throws InterruptedException
			{
				driver = new ChromeDriver();
			
				driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
				
				driver.manage().window().maximize();
				
				//Simple ALert
				SimpleAlert=driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
				SimpleAlert.click();
					
				String alerttext = driver.switchTo().alert().getText();// Get the message of alert pop up 
				System.out.println(alerttext);	
				
				 // Accept used for ok, done, yes
				driver.switchTo().alert().accept();
				//driver.close();
				
				//driver.switchTo().alert().dismiss(); //Dismiss used for cancel
				}
				}

		


	


