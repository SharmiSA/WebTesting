package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions
{
	 public static void main(String[] args)
	
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/buttons");
	     driver.manage().window().maximize();
	   
		
	     Actions actions = new Actions(driver);
		 WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		 actions.contextClick(btnElement).build().perform();
		 
		 WebElement Rightclkmsg = driver.findElement(By.id("rightClickBtn"));
		 String Rightclkmsgtxt = Rightclkmsg.getText();
		 System.out.println(Rightclkmsgtxt);
	   
	   driver.close();
	   
	 }	  
	}


