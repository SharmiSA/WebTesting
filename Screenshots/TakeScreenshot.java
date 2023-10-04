package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot 
{

	public static void main(String[] args) throws IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours//");
		driver.manage().window().maximize();
				
		WebElement Register = driver.findElement(By.xpath("//a[text()='REGISTER']"));
		
		//Take screenshot of whole webpage
		//File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./snap/pic.jpeg");
		
		
		//Taken screenshot of particular webelement in a  webpage
		File screenshotAs = Register.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Registerbtn.jpeg");
		
		FileUtils.copyFile(screenshotAs, dest);
		
	

	}

}
