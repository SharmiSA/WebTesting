package Screenshots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class CaptureScreenshot_Element 
{
	public static WebDriver driver;
	
		public static void captureWebElementscreenshot(WebDriver driver, WebElement tizagimg) throws IOException
		
		{
			Date d=new Date();
			
			String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
			
			File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			BufferedImage Fullimg = ImageIO.read(screenshot);
			
			Point pt = tizagimg.getLocation();
			int fnamehgt=tizagimg.getSize().getHeight();
			int fnamewid=tizagimg.getSize().getWidth();
			
			BufferedImage eleScreenshot = Fullimg.getSubimage(pt.getX(), pt.getY(), fnamewid, fnamehgt);
			ImageIO.write(eleScreenshot, "jpg", screenshot);
			
			File Screenshotlocation = new File("C:\\TL_Selenium\\Practice_JavaSelenium\\Topics_Selenium\\src\\main\\java\\Screenshots\\"+filename);
			FileUtils.copyFile(screenshot, Screenshotlocation);
		}
		
		
		public static void main(String[] args) throws IOException
		{
			WebDriver driver = new EdgeDriver();
			
			//driver.get("https://demo.guru99.com/test/newtours/");
			driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
			
			driver.manage().window().maximize();
			
				//WebElement register = driver.findElement(By.linkText("REGISTER"));
			//register.click();
			
			//WebElement fname = driver.findElement(By.name("firstName"));
			//fname.sendKeys("Christy");
			WebElement tizagimg = 	driver.findElement(By.xpath("//b[text()='Advertise on Tizag.com']"));		
			//captureElementscreenshot(fname);
			
			captureWebElementscreenshot(driver, tizagimg);
			
			driver.close();


			

	}

}
