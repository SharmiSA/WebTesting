package RadioButton_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class All_radio_btn_print_and_also_validate 
{
	
	public static void main(String[] args) 
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\chromedriver.exe");

//		ChromeOptions options = new ChromeOptions();
//
//		options.addArguments("--remote-allow-origins=*");
//
//		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		

		WebDriver driver = new EdgeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		System.out.println("Group 1 Radiobutton count is - " + count);
		
		//loop for selecting radio button dynamically (Cheese) 
		
		for(int i=0;i<count;i++) 
		{
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				
				System.out.println(text + " Radio button is clicked");
				
			    break;
			}
			else
			{
				System.out.println(text + " Radio Button not matched");
			}
			
		}
		//driver.close();
		
	}		
}