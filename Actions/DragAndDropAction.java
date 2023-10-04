package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		
		// find element which we need to drag
		WebElement Src_drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		// find element which we need to drop
		WebElement Dest_drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		// this will drag element to destination
		act.dragAndDrop(Src_drag, Dest_drop).build().perform();
		
		String droppedtext = driver.findElement(By.xpath("//div[@id='droppable']//p")).getText();
		
		System.out.println(droppedtext);
		
		System.out.println("Element is dragged and dropped Successfully");
		
		driver.close();
		
	}
}
