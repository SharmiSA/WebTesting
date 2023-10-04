package concepts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor_Click
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		 //JavaScriptExecutor - Interface,it helps to execute javascript through Selenium WebDriver
		 //2 Methods - ExecuteScript and ExecuteAsyncScript -> it helps to run JS on window
		 
		 driver.get("https://demo.guru99.com/test/newtours//");
		
		driver.manage().window().maximize();
		
//		 driver.findElement(By.name("uid")).sendKeys("mercury");					
//	     driver.findElement(By.name("password")).sendKeys("1");
//	     WebElement button =driver.findElement(By.name("btnLogin"));
	          
		JavascriptExecutor js = (JavascriptExecutor) driver;//Typecasting method
		
		//Passing value in a text box
		
		js.executeScript("document.getElementByName('userName').value='SeleniumTesting';");
		js.executeScript("document.getElementByName('password').value='mercury';");
		
		//Handling Click
		js.executeScript("document.getElementByName('btnLogin').click(); ");
		
	//	js.executeScript("arguments[0].click();", button);
		
		//To Scroll Down
		js.executeScript("window.scrollBy(0,1000)");
		
		//Handling Alert
		js.executeScript("alert('User or Password is not valid');");  
		
		driver.quit();
	}

}
