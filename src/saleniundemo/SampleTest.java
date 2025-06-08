package saleniundemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	
	public static void main(String[] args) {
		
	    //chromedriver.exe
		//	System.setProperty("webdriver.chrome.driver","F:\\Driver New\\selenium-server-standalone-3.141.59 (1).jar");
			
		 
		ChromeDriver driver = new ChromeDriver();
		
	   driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ARpgrqf7mAMbKsrw6kte9nthAEMBQsd3UOY8tly2MloUIaWfokK0EUdmuiK0YVOLmDzOnyl34c8JLA&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("identifierId")).sendKeys("Shrikrashna.gutte@gmail.com");
		
	    driver.findElement(By.className("VfPpkd-LgbsSe")).click();
	     
	    
		//String url = driver.getCurrentUrl();
		
		//System.out.println(url);
		
		//String Title =driver.getTitle();
		
		//System.out.println(Title); 
		
		//driver.close(); 	
	    
	   /* driver.switchTo().newWindow(WindowType.TAB); // Opens a new Tab and switches to new Tab

	    driver.navigate().to("https://www.goibibo.com/flights/"); //  newly opened window 
	    
	   driver.close(); // close newly/second opened tab.
	    
	    driver.quit(); // close all tabs and Browser*/

		  
		
			}
		}



