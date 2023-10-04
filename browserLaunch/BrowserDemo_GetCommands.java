package browserLaunch;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDemo_GetCommands 
{
	public static WebElement Uname;
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.edge.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); //Edge Browser is Called
		
		driver.manage().window().maximize(); //Screen is maximized		
		
		driver.get("https://www.demoblaze.com/"); //launching URL
		
		System.out.println(driver.getTitle()); //Prints Title of webpage
		
		//System.out.println(driver.getCurrentUrl()); //Prints current URL
		
		//System.out.println(driver.getPageSource());
		//System.out.println("Sign Up Functionality");
		
		//driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
//		Uname = driver.findElement(By.xpath("//input[@id='sign-username']"));
//		Uname.sendKeys("christysharm@gmail.com");
		
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(30));
//		w.until(ExpectedConditions.visibilityOf(Uname));
		
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(30));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sign-username']")));
		
				
//		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("christy9");
//		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		//Explicit wait - Will be applied to particular WebElement; 
		//Aong with Wait time, I will also set Expectedconditions.
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.alertIsPresent());
	
//		//Implicit wait - Will be applied to all WebElements; One time declaration is enough
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
		
		//It will wait until the page loads
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//It is Applied to Script
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
				
//		String alerttext = driver.switchTo().alert().getText();// Get the message of alert pop up 
//		System.out.println(alerttext);	
//		driver.switchTo().alert().accept();
		
		System.out.println("Sign In Functionality");
		
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		driver.findElement(By.id("loginusername")).sendKeys("christysharm@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("christy9");
		driver.findElement(By.xpath("//button[@onclick='logIn()']")).click();
		
		driver.close(); //It will close current window
		//driver.quit(); //It will close all the browsers opened
		
		
		
		
		
		
		
	}
}	
