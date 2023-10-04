package RadioButton_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_Radio_btn_dynamically 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		//Group 1 Radiobutton webelement locator
		
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		System.out.println("Group 1 Radiobutton count is - "+ count);
		
		//loop for selecting radio button dynamically (Butter)
		
		for(int i=0;i<count;i++)
		{
				String text= driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
				
				System.out.println(text);
				
				if(text.equalsIgnoreCase("Milk"))
				{
					driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
					
					System.out.println(text + " Radio button is clicked");
					
					break;
				}
				else
					{
						System.out.println(text+" Radio Button is not matched");
					}
				}
					
			// Group 2 Radiobutton webElement locator
			int count1 =driver.findElements(By.xpath("//input[@name='group2']")).size();
			
			System.out.println("Group 2 Radiobutton count - "+count1);
			
			//loop for selecting radio button dynamically (one by one)
			for(int j=0;j<count1;j++)
			{
				String text= driver.findElements(By.xpath("//input[@name='group2']")).get(j).getAttribute("value");
				
				System.out.println(text);
				
				if(text.equals("Water"))
				{
					driver.findElements(By.xpath("//input[@name='group2']")).get(j).click();
					
					System.out.println(text + " Radio button is clicked");
					
				    break;
				    
				}
				else
					{
						System.out.println(text+" Radio Button not matched");
					}
				}
			
			driver.close();
		}}
	
	
