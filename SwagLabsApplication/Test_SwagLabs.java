package SwagLabsApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_SwagLabs
{
	public static WebElement login_btn,Pwd, Closebtn,Uname,Backpack,Openbtn,AddCart,Chkout, Cart,All_Items;

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\chromedriver_win32\\chromedriver.exe");
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		driver.navigate().to("https://www.saucedemo.com/inventory.html/");
		
		driver.manage().window().maximize(); 
		
		Uname = driver.findElement(By.id("user-name"));
		Uname.sendKeys("standard_user");
		
		Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("secret_sauce");
		
		login_btn = driver.findElement(By.name("login-button"));
		login_btn.click();
		
		Openbtn = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		Openbtn.click();
		
		All_Items = driver.findElement(By.xpath("//a[text()='All Items']"));
		All_Items.click();
		
		Closebtn = driver.findElement(By.xpath("//button[text()='Close Menu']"));
		Closebtn.click();
			
//		Backpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
//		Backpack.click();
//		
//		AddCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//		AddCart.click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Cart = driver.findElement(By.id("shopping_cart_container"));
//		Cart.click();
//		
//		Chkout = driver.findElement(By.id("checkout"));
//		Chkout.click();
		
		driver.close();
	}

}
