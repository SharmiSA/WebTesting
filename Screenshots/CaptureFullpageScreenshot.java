package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CaptureFullpageScreenshot 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new EdgeDriver();	
		
		driver.get("https://demo.guru99.com/test/newtours//");
		
		driver.manage().window().maximize();
		
		Date d=new Date();
		System.out.println(d);
		
		String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		// download latest jar file - https://jar-download.com/artifacts/ru.yandex.qatools.ashot/ashot
		// Add to project library
		
		// Ashot() is a third party utility that is supported by the Selenium web driver to capture the full pagescreenshots.
		//Ashot does - Capturing the full page,	Capturing the web element, Comparing images
		
		//Create an Ashot object and call takeScreenshot() method if you just want the screenshot for the screen size page.

		//If fullpage has to be taken screenshot then call the shootingStrategy() method before calling takeScreenshot() method to set up the policy. 
		//Then call a method takeScreenshot() passing the webdriver.

		//1000 is scrolled out time in milliseconds, so for taking a screenshot, the program will scroll for each 1000 msec.

		//Now, get the image from the screenshot and write it to the file. You can provide the file type as jpg, png
				
	
		Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		File dest = new File("./Screenshots/fullscreenshot.jpeg");
		
		ImageIO.write(sc.getImage(), "jpg", dest);
		
		driver.close();
	}

}
