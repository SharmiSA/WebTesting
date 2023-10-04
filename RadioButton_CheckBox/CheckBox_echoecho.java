package RadioButton_CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox_echoecho 
{

	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		//CheckBox - 3Methods
		// a) isDisplayed()
		//b) isSelected()
		// isEnabled()
		
		/*To select particular checkbox or handle single checkbox
		WebElement cheese = driver.findElement(By.name("option3"));
		cheese.click();
		
		if(cheese.isSelected())
		{
			System.out.println("Cheese Option got Selected");
		}
		else
		{
			System.out.println("Cheese Option didn't get Selected");
		}*/
			
		
		int count = driver.findElements(By.xpath("//td[@class='table5']//input[@type='checkbox']")).size();
		System.out.println("Total no of CheckBoxes:" + count);
		
		for (int i=0;i<count;i++)
		{
			String chkbxName = driver.findElements(By.xpath("//td[@class='table5']//input[@type='checkbox']")).get(i).getAttribute("value");
			System.out.println("CheckBox Name: "+ chkbxName);
			
//			if(chkbxName.equals("Butter"))
//			{
//				System.out.println(chkbxName +" is selected by default");
//				break;
//			}
//			else
//			{
//				System.out.println(chkbxName +" is not selected by default");
//			}
			
			
			WebElement cheesechkbx = driver.findElement(By.name("option3"));
			cheesechkbx.click();
			
			if(cheesechkbx.isSelected())
			{
				System.out.println(chkbxName + " got Selected");
			}
			else
			{
				System.out.println(chkbxName + " didn't get Selected");
			}
			
		}
		
		//driver.close();

	}
	}

