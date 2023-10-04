package concepts;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor_ScrollDown
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		
		 //JavaScriptExecutor - Interface,it helps to execute javascript through Selenium WebDriver
		 //2 Methods - ExecuteScript and ExecuteAsyncScript -> it helps to run JS on window
		 	
		driver.get("https://moneyboats.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//Typecasting method
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.close();
	}

}
