package DynamicStaticDropdownExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicBookSpicejetCheckbox
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://corporate.spicejet.com/default.aspx");
				
		List<WebElement> listchkbox = driver.findElements(By.xpath("//div[@class='row1 padding-bottom-3 home-dis-checkboxes']//div//input"));
		
		int count  = listchkbox.size();
		
		System.out.println("Checkbox type count - " + count);
		
		for(int i=0;i<count;i++)
		{	
			String chkboxName = driver.findElements(By.xpath("//div[@class='row1 padding-bottom-3 home-dis-checkboxes']//div//label")).get(i).getText();
			
			System.out.println("CheckBox Name:" + chkboxName);
		
			/* Family & Friends
			 Sr. Citizen
			 Armed Forces
			 LTC Fare
			 Govt. Employee
			 Student
			 Unaccompanied Minor
			 Health Professional
			 */

			if(chkboxName.equals(" Health Professional"))
			{
				listchkbox.get(i).click();
				
				String tooltip = driver.findElements(By.xpath("//div[@class='row1 padding-bottom-3 home-dis-checkboxes']//div//a//span")).get(i).getText();
				System.out.println(chkboxName +" tooltip content is " +  tooltip);
				break;
				
			}
			else
			{
				System.out.println(chkboxName+" not matched");
			}	
		}
	}
}
