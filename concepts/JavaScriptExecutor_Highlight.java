package concepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor_Highlight
{

	public static void main(String[] args) throws IOException
	{
		 WebDriver driver = new ChromeDriver();
		
		 //JavaScriptExecutor - Interface,it helps to execute javascript through Selenium WebDriver
		 //2 Methods - ExecuteScript and ExecuteAsyncScript -> it helps to run JS on window
		 
		 
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement Submit_Btn = driver.findElement(By.id("mySubmit"));
		//1st Method
		//((JavascriptExecutor) driver).executeScript("myFunction()");
		
		//2nd Method
		JavascriptExecutor js = (JavascriptExecutor) driver;//Typecasting method
		js.executeScript("myFunction()");
		
		//Highlighting an Element
		js.executeScript("arguments[0].style.border='5px solid red'",Submit_Btn);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		//driver.close();
	}

}
