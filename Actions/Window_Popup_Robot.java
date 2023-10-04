package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup_Robot 
{
	public WebDriver driver;
    public static void main(String[] args) throws AWTException 
    {
		 WebDriver driver = new ChromeDriver();
	    		
	    		   // setting up property to suppress the warning
	            System.setProperty("webdriver.chrome.silentOutput","true");
	            
                driver.get("http://demo.tanmaysarkar.com/sample_03.html");
	             
	             driver.manage().window().maximize();
	            
	             // input box ACCESSKEY 
	          	             
	             Robot r = new Robot();
	                        	          
	             System.out.println("Providing First Name");
	                  
	             r.keyPress(KeyEvent.VK_TAB);
	                         
	             r.keyRelease(KeyEvent.VK_TAB);
	             	            	             
	             r.keyPress(KeyEvent.VK_B);
	             
	             r.keyRelease(KeyEvent.VK_B);
	             
	             if(driver.findElement(By.xpath("//input[@name='ts_first_name']")).getAttribute("value").equalsIgnoreCase("B"))
		 	     
	             System.out.println("First name is provided");
	             
	             else
	            	
	            	 System.out.println("First name is not provided");
	             			
	             	 System.out.println("Providing Last Name");
	             
	             r.keyPress(KeyEvent.VK_ALT);
	             r.keyPress(KeyEvent.VK_SHIFT);
	             r.keyPress(KeyEvent.VK_L);
	              
	             r.keyRelease(KeyEvent.VK_ALT);
	             r.keyRelease(KeyEvent.VK_SHIFT);
	             r.keyRelease(KeyEvent.VK_L);
	            	             
	             r.keyPress(KeyEvent.VK_A);
	             r.keyRelease(KeyEvent.VK_A);
	           
	             if(driver.findElement(By.xpath("//input[@name='ts_last_name']")).getAttribute("value").equalsIgnoreCase("A"))
	 	            
	            	 System.out.println("Last name is provided");
	             
	             else
	            	 System.out.println("Last name is not provided");
	             
	             
	             System.out.println("Providing Address");
	             
	             	 r.keyPress(KeyEvent.VK_TAB);
	             
	                 r.keyRelease(KeyEvent.VK_TAB);
	             	
	             	 r.keyPress(KeyEvent.VK_C);
	             	 
	             	 r.keyRelease(KeyEvent.VK_C);
	           
	             if(driver.findElement(By.xpath("//textarea[@id='ts_address']")).getAttribute("value").equalsIgnoreCase("C"))
	 	            
	            	 System.out.println("Address is provided");
	             
	             else
	            	 System.out.println("Address is not provided");
	             
	        
	             System.out.println("Providing Terms and Conditions");
	             
	               r.keyPress(KeyEvent.VK_TAB);
	             
	               r.keyPress(KeyEvent.VK_TAB);
	             
	               r.keyPress(KeyEvent.VK_D);
	             
	               r.keyRelease(KeyEvent.VK_D);
	           
	             if(driver.findElement(By.xpath("//textarea[@id='ts_address']")).getAttribute("value").equalsIgnoreCase("D"))
	 	            
	            	 System.out.println("Terms and Conditions is provided");
	             
	             else
	            	 System.out.println("Terms and Conditions is not provided");
	             
	             // Checkbox box ACCESSKEY check             
	             r.keyPress(KeyEvent.VK_ALT);
	             r.keyPress(KeyEvent.VK_SHIFT);
	             r.keyPress(KeyEvent.VK_H);
              
	             r.keyRelease(KeyEvent.VK_ALT);
	             r.keyRelease(KeyEvent.VK_SHIFT);
	             r.keyRelease(KeyEvent.VK_H);
	                                
	            if(driver.findElement(By.xpath("//input[contains(@name,'ts_checkbox1')]")).isSelected())
	             {
	                 System.out.println("Cricket option is checked");
	             }
	             else
	             {
	                 System.out.println("Cricket option is NOT checked");
	             }
	            
	            driver.findElement(By.xpath("//input[@value='Submit']")).click();
	            
	            //Single window(getwindowhandle) - return type is String
	            String Parenttitle = driver.getTitle(); 
	            
	            System.out.println("Parent Window Title: " + Parenttitle);
	            
	            //Multiple windows(getwindowhandles) - return type is Set
	             Set<String> win_id = driver.getWindowHandles(); // Set stores all the windows opened
	    		
	            //It will traverse between windows opened
	             Iterator<String> it = win_id.iterator();
	    		
	             //Next() - It will move pointer to next window from current window
	    		String parentid=it.next();
	    		System.out.println(parentid);
	    		
	    		String childid=it.next();
	    		System.out.println(childid);
	    		
	    		//It will jump to next window from current window
	    		driver.switchTo().window(childid);
	    		
	    		driver.manage().window().maximize();
	    		
	    	    String Childtitle = driver.getTitle();
		            
		        System.out.println("Child Window Title: " + Childtitle);
		            
	    	    if(Childtitle.contains("Auto Popup :: Tanmay Sarkar"))
	           {
	        	   System.out.println("We are in Same Page");
	           }
	           else
	           {
	        	   System.out.println("We are in different Page");
	           }
	           driver.close(); //closes the child window
	           driver.switchTo().window(parentid); // to jump control to parent window
	           driver.close();//closes the parent window
	      }
	 		
	 			
	        
	    }

