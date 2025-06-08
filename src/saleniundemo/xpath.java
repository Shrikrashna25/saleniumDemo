package saleniundemo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.goibibo.com/");
		 driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[@class=\"sc-12foipm-2 eTBlJr fswFld \"]")).click();
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::input")).sendKeys("Mumbai");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::li[1]")).click();
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::input")).sendKeys("Pune");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::li[1]")).click();
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-91 biWUTl\"]")).click();
	     driver.findElement(By.xpath("//span[@class=\"sc-12foipm-72 ezNmSh\"]")).click();
		
		
		/*driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"][1]")).sendKeys("PUNE JN - PUNE (PUNE)"); 
		driver.findElement(By.xpath("//li[@class=\"ng-tns-c57-8 ng-star-inserted ui-autocomplete-list-item ui-corner-all\"]"));
		driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"][2]")).sendKeys("PARLI VAIJNATH - PRLI");
		driver.findElement(By.xpath("//li[@class=\"ng-tns-c57-9 ng-star-inserted ui-autocomplete-list-item ui-corner-all\"]"));
		driver.findElement(By.xpath("//button[@class=\"search_btn train_Search\"]")).click();
		*/
   	       //driver.get("https://www.amazon.in/");
		
	       //driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
			
		  // driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Redmi 13C",Keys.ENTER);
				
		
	  
	    
	  //  driver.get("https://stqatools.com/");
	    
	  //  driver.findElement(By.xpath("//img[@class='gfg_logo_img']"));
		
		
	    
	//    driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ARpgrqf7mAMbKsrw6kte9nthAEMBQsd3UOY8tly2MloUIaWfokK0EUdmuiK0YVOLmDzOnyl34c8JLA&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    
	//    driver.findElement(By.id("identifierId")).sendKeys("Shrikrashna.gutte@gmail.com");
	    
	 //   driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d'][3]")).click();

	}

}
