package RadioButton_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobutton 
{
	public static WebElement cheese_rdbtn1, waterrdbtn2;
	
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println(driver.getTitle());			
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		System.out.println("Cheese option is selected from Group 1");
		
		driver.findElement(By.xpath("//input[@value='Water']")).click();
		System.out.println("Water option is selected from Group 2");	
		
		driver.close(); 
	}	
}
