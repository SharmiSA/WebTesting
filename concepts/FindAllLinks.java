package concepts;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.*;

public class FindAllLinks
{

	public static void main(String[] args)  throws StaleElementReferenceException
	{
		WebDriver driver = new EdgeDriver();
		 
		driver.manage().window().maximize();
		 
		  String baseUrl = "http://demo.guru99.com/test/newtours/";					
     				        		
		  String underConsTitle = "Under Construction: Mercury Tours";		
		  
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));				

		  driver.get(baseUrl);					
         
		 List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		 System.out.println("Total links present in this Webpage: " + linkElements.size());
		  
		  String[] linkTexts = new String[linkElements.size()];	
          
		//  String s =new String("Maha");
		  
		  int	i = 0;					
		  	//extract the link texts of each link element		
			for (WebElement e : linkElements)
			{							
			linkTexts[i] = e.getText();	
			i++;			
			}		

			//test each link		
			for (String t : linkTexts)
			{							
			driver.findElement(By.linkText(t)).click();
			
			if (driver.getTitle().equals(underConsTitle))
			{								
                System.out.println("\"" + t + "\"" + " is under construction.");			
            } 
			else
			{			
                System.out.println("\"" + t + "\"" + " is working.");								
                       		
            }		
			driver.navigate().back();			
        }
	}
}
		 



