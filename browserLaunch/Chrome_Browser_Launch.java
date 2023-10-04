package browserLaunch;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Chrome_Browser_Launch 
{
	public static WebElement registerlink,fname,lname,phone,email,address,city,state,pcode,country;
	
	public static void main(String args[]) throws InterruptedException, SocketException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
    	 
		 //options.addArguments("--remote-allow-origins=*");

		 WebDriver driver = new ChromeDriver(options);
		 	 
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/index.php");

        //CSSPATH - LOCATORS
        driver.findElement(By.cssSelector("a[href$=\"ter.php\"]")).click();
        
        System.out.println("Contact Information");
        
        fname = driver.findElement(By.cssSelector("input[name=firstName]"));
        fname.sendKeys("Jairam1");
        
        lname = driver.findElement(By.cssSelector("input[name=lastName]"));
        lname.sendKeys("JS1");
        
        phone = driver.findElement(By.cssSelector("input[name=phone]"));
        phone.sendKeys("9876987612");
        
        email = driver.findElement(By.cssSelector("input#userName"));
        email.sendKeys("js@gmail.com");
        
        System.out.println("Mailing Information");
        
        address = driver.findElement(By.cssSelector("input[name=address1]"));
        address.sendKeys("abc");
        
        city = driver.findElement(By.cssSelector("input[name=city]"));
        city.sendKeys("Chennai");
        
        state = driver.findElement(By.cssSelector("input[name=state]"));
        state.sendKeys("TN");
        
        pcode = driver.findElement(By.cssSelector("input[name=postalCode]"));
        pcode.sendKeys("987612");
        
        country = driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        
        Select s = new Select(country);
        //s.selectByIndex(6);
        //s.selectByValue("ANGUILLA");
        s.selectByVisibleText("AUSTRIA");
        		
        System.out.println("User Information");
        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("JR");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("JR123");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("JR123");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
        driver.close();
	}
}
