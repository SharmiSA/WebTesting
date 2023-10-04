package RobotClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//https://www.autoitscript.com/site/autoit-script-editor/downloads/


public class SampleAutoIT 
{

	
//	ControlFocus(” title “,” text “,controlID ) //Sets input focus to a given control on a window.
//	ControlSetText(” title “,” text “,controlID ,” File path which need to upload ” ) // Sets text of a control.
//	ControlClick(” title “,” text “,controlID ) //Sends a mouse click command to a given control.
	
	
	
	public static void main(String[] args) throws IOException, ElementNotInteractableException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/autoit.html");	
		
		System.out.println("Frame count is: "+driver.findElements(By.tagName("iframe")).size());

		//Switching from current webdriver window to frame
		WebElement IframeElement =driver.findElement(By.xpath("//iframe[@title='Archive']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Archive']")));
		driver.switchTo().frame(IframeElement);
				
		//driver.findElement(By.id("postjob")).click();			
		driver.findElement(By.id("input_3")).sendKeys("Sharmila");                                 					
	    driver.findElement(By.id("input_4")).sendKeys("christysharmila9@gmail.com");					
	   
	    // below line execute the AutoIT script .
	    Runtime.getRuntime().exec("C:\\TL_Selenium\\Practice_JavaSelenium\\LearnSeleniumConcepts\\src\\\\RobotClass\\FileUpload.exe");
	    
	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    driver.findElement(By.id("input_2")).click();
	    System.out.println("Uploading a File via AutoIT is Successful");
	    
	    driver.close();	
   }
 
}


