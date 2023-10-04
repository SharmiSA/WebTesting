package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyboardEvents {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
//		WebElement signin = driver.findElement(By.xpath("//a[text()='Sign in']"));
//		signin.click();
		
		driver.findElement(By.id("identifierId")).sendKeys("smahalakshmi079@gmail.com");
		
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		action.sendKeys(Keys.chord(Keys.CONTROL+"f")).perform();
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		driver.findElement(By.id("identifierId")).click();
			
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		//driver.close();
	}

}
