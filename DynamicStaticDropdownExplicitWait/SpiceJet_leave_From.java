package DynamicStaticDropdownExplicitWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet_leave_From
{
	public static WebElement charter, addons,Search,Triptype,Select_To_Date,To_Date,Select_From_Date,From_Date,tbl_leaving_to,drpdown_leaving_To, drpdown_leaving_from,tbl_leaving_from;
	
	public static void main(String[] args) throws ElementNotInteractableException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://corporate.spicejet.com/default.aspx");
				
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//addons=driver.findElement(By.linkText("ADD-ONS"));
		//addons.click();
		
		//charter  = driver.findElement(By.partialLinkText("Char"));
		//charter.click();
				
		drpdown_leaving_from = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		drpdown_leaving_from.click();
			
		tbl_leaving_from = driver.findElement(By.xpath("//table[@id='citydropdown']"));
		
		List<WebElement> lst_leaving_from = tbl_leaving_from.findElements(By.tagName("a"));
		
		System.out.println("The count of departure Cities are "+lst_leaving_from.size());
				
		for(WebElement city:lst_leaving_from) //Enhanced For Loop
		{
			String city_name = city.getText();
			
			//System.out.println(city_name);
			if(city_name.contains("Ahmedabad"))
			{
				city.click();
				System.out.println(city_name + " is selected ");
				break;
			}
			else
			{
				System.out.println("Not a Valid city Name for Destination Place");
			}
			
		}
		drpdown_leaving_To = driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		drpdown_leaving_To.click();
		
		tbl_leaving_to = driver.findElement(By.xpath("(//table[@id='citydropdown'])[2]"));
		
		List<WebElement> lst_leaving_to = tbl_leaving_to.findElements(By.tagName("a"));
		
		System.out.println("The count of Arrival cities are "+lst_leaving_from.size());
		
		//Enhanced For Loop or For each loop
		for(WebElement city:lst_leaving_to)
		{
			String city_name = city.getText();
			
			//System.out.println(city_name);
			
			if(city_name.contains("Amritsar (ATQ)"))
			{
				city.click();
				
				System.out.println(city_name+" is selected");
				break;
			}
			else
			{
				System.out.println("Not a Valid city Name for Arrival City");
			}
		}
		try
		{
			From_Date= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
			From_Date.click();			
		}
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
		
		try
		{
			Select_From_Date= driver.findElement(By.xpath("//td[@data-year='2023' and @data-month='9']//a[text()='3']"));
			Select_From_Date.click();
		}
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
	
		try
		{
			To_Date= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
			To_Date.click();
		
		}
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
	
		try
		{
			Select_To_Date= driver.findElement(By.xpath("//td[@data-year='2023' and @data-month='9']//a[text()='13']"));
			Select_To_Date.click();
		}
	
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
	
		WebElement drpdwn_passengers=driver.findElement(By.xpath("//div[@class='row1 adult-infant-child']"));
		drpdwn_passengers.click();
		
		try
		{
		WebElement drpdwn_adult=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		drpdwn_adult.click();
		
		Select s = new Select(drpdwn_adult);
		s.selectByIndex(2);
		}
		
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
		
		try
		{
		WebElement drpdwn_child=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		drpdwn_child.click();
		
		Select s1 = new Select(drpdwn_child);
		s1.selectByVisibleText("2");
		}
		
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
		try
		{
		WebElement drpdwn_infant=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
		drpdwn_infant.click();
		
		Select s2 = new Select(drpdwn_infant);
		s2.selectByValue("1");
		}
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
		try
		{
		WebElement drpdwn_currency=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		drpdwn_currency.click();
		
		Select s3 = new Select(drpdwn_currency);
		s3.selectByValue("EUR");
		}
		catch(ElementNotInteractableException e)
		{
			e.getMessage();
		}
		
		List<WebElement> listchkbox = driver.findElements(By.xpath("//div[contains(@class,'row1 padding-bottom-3 home')]//div//input"));
		
		int count  = listchkbox.size();
		
		System.out.println("Checkbox type count - " + count);
		
		for(int i=0;i<count;i++)
		{	
			String chkboxName = driver.findElements(By.xpath("//div[contains(@class,'row1 padding-bottom-3 home')]//div//label")).get(i).getText();
			
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

			if(chkboxName.contains("Health Professional"))
			{
				listchkbox.get(i).click();
				
				String tooltip = driver.findElements(By.xpath("//div[contains(@class,'row1 padding-bottom-3 home')]//div//span")).get(i).getText();
				System.out.println(chkboxName +" tooltip content is " +  tooltip);
				break;
				
			}
			else
			{
				System.out.println(chkboxName+" not matched");
			}	
		
		Search=driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_btn_FindFlights']"));
		Search.click();
		
		driver.close(); 
	}
	}
}
	
