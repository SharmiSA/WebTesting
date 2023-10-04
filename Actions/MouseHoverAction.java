package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction 
{
	public static WebElement MI2;
	
	public static void main(String[] args) throws InterruptedException, ElementClickInterceptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/menu/");
		
		Actions act = new Actions(driver);
		
		MI2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		act.moveToElement(MI2).build().perform();
		
		driver.close();
		
	}
}
	