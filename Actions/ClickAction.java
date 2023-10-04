package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickAction 

{	public static WebElement Name, Email,pwd, chkbx, signInbtn;
	
	 public static void main(String[] args) throws ElementClickInterceptedException
	 {
		 ChromeDriver driver = new ChromeDriver();

    // Launch the URL 
   driver.get("https://www.browserstack.com/");
   
   System.out.println("Browserstack webpage displayed");
	
   //Maximise browser window
   driver.manage().window().maximize();
   
	//Instantiate Action Class
   Actions act = new Actions(driver);
	 
   //Retrieve WebElement to perform click
   WebElement getstartedfree = driver.findElement(By.xpath("//a[@id='signupModalButton']"));
	 
   //build - it is used to create an acton
   //perform - Used to execute an action which is created by build.
   
   act.click(getstartedfree).build().perform();
   
   System.out.println("Click Actions is Performed");

   Name = driver.findElement(By.id("user_full_name"));
   Name.sendKeys("Vignesh Selenium ");
   
   Email = driver.findElement(By.id("user_email_login"));
   Email.sendKeys("vigneshSelenium@gmail.com");
   
   pwd = driver.findElement(By.id("user_password"));
   pwd.sendKeys("Selenium@123");
   
   chkbx= driver.findElement(By.xpath("(//input[@class='bs-checkbox signup-checkbox'])[1]"));
   chkbx.click();
   
   //Applied explicit wait for check box
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   wait.until(ExpectedConditions.elementToBeClickable(chkbx)); 
 
   signInbtn = driver.findElement(By.id("user_submit"));
   signInbtn.click();
   
   driver.close();
   
   
}
}
