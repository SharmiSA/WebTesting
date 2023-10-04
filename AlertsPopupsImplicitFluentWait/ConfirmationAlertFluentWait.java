package AlertsPopupsImplicitFluentWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ConfirmationAlertFluentWait
{
static WebDriver driver;
				
static WebElement confirm_Alert,cnt_btn;
			
public static void main(String[] args) throws InterruptedException
		
{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptconfirm.php");
					
		driver.manage().window().maximize();	
										
		//Confirmation ALert
		confirm_Alert=driver.findElement(By.xpath("//input[@value='Leave Tizag.com']"));
		confirm_Alert.click();
		
		String Confirmalerttext = driver.switchTo().alert().getText(); // Get the message of alert pop up 
		System.out.println(Confirmalerttext);	
		
	//	Fluent Wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);// similar to list
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(5));//similar to loop
		wait.ignoring(InterruptedException.class);
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept(); 
					
		String text = driver.switchTo().alert().getText(); 
		System.out.println(text);
		
		// Accept used for ok, done, yes
		driver.switchTo().alert().accept();
					
		driver.quit();
		//driver.switchTo().alert().sendKeys("Good");
		//driver.switchTo().alert().dismiss(); //Dismiss used for cancel
											
	}
}

			


		




