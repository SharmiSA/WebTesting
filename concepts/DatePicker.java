package concepts;


import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker
{
	public static void main(String[] args) throws ElementClickInterceptedException, InterruptedException
    {

        //DAte and Time to be set in textbox

        String dateTime ="18/6/2023 2:30 PM";
       
        String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
        
        System.setProperty("webdriver.edge.driver", "C:\\TL_Selenium\\Softwares\\Latest Release\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
         
        //button to open calendar

       	WebElement selectDate = driver.findElement(By.xpath("//button[@aria-label='Open the date view']"));
    	selectDate.click();
      
       try
       
       {
    	   //button to move next in calendar
      
        WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header k-hstack']//a[contains(@class,'k-calendar-nav-next')]"));

        //button to click in center of calendar header

        WebElement midLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header k-hstack']//a[contains(@class,'k-calendar-nav-fast')]"));

        //button to move previous month in calendar

        WebElement previousLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header k-hstack']//a[contains(@class,'k-calendar-nav-prev')]")); 

       //Split the date time to get only the date part

      

        //get the year difference between current year and year to set in calendar

        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[1]) - Calendar.getInstance().get(Calendar.YEAR);

        midLink.click();

        if(yearDiff!=0)
        {

            //if you have to move next year

            if(yearDiff>0)
            {
                for(int i=0;i< yearDiff;i++)
                {
                  System.out.println("Year Diff->"+i);
                  
                  nextLink.click();
                }
            }

            //if you have to move previous year

            else if(yearDiff<0)
            {
                for(int i=0;i< (yearDiff*(-1));i++)
                {
                 System.out.println("Year Diff->"+i);
                 
                 previousLink.click();
                }
           
      
            }
       
        }
       }
        
        catch(ElementClickInterceptedException e)
        {
     	   e.printStackTrace();
        }
       
       
        
       Thread.sleep(1000);

        //Get all months from calendar to select correct one

        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
        
        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
        
        Thread.sleep(1000);

        //get all dates from calendar to select correct one

        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
        
        list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
        
        ///FOR TIME

        WebElement selectTime = driver.findElement(By.xpath("//button[@aria-label='Open the time view']"));

        //click time picker button

        selectTime.click();

        //get list of times

        List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup']//ul[@role='listbox']"));
      
        dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

     //select correct time

        for (WebElement timing : allTime) 
        {
            if(timing.getText().equalsIgnoreCase(dateTime))
            {
            	timing.click();
            }
            driver.close();

        }

    }

}