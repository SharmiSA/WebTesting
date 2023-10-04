package Actions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
	    System.out.println("demoqa webpage displayed");
		driver.manage().window().maximize();
	    
	    WebElement dblclk = driver.findElement(By.id("doubleClickBtn"));
	    Actions a = new Actions(driver);
	    a.doubleClick(dblclk).build().perform();
	    
	   WebElement dbleclkmsg = driver.findElement(By.id("doubleClickMessage"));
	   String Dbleclkmsgtext = dbleclkmsg.getText();
	   System.out.println(Dbleclkmsgtext);
	   driver.quit();
	   
}

}