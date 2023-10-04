package concepts;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandleNotifications_Edge 
{

	public static void main(String[] args) 
	{
		//Notifications from the Browser
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");
				
		EdgeDriver driver = new EdgeDriver(opt);
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.close();
	}

}
