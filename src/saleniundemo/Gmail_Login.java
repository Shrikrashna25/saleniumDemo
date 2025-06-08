package saleniundemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.opentelemetry.context.ImplicitContextKeyed;


import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

public class Gmail_Login {
	
 public static void main(String[] args) {
	    
 ChromeDriver driver = new ChromeDriver();
	     driver.get("https://accounts.google.com/signin");
	      driver.manage().window().maximize();
	      driver.findElement(By.name("identifier")).sendKeys("Shrikrashna.gutte@gmail.com");
	      WebElement e =driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"]"));
	      FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
	      wait.withTimeout(Duration.ofSeconds(60));
	      wait.pollingEvery(Duration.ofMillis(250));
	      wait.withMessage("Elementb dint appear in time out");
	      wait.ignoring(ElementNotInteractableException.class);
	    //  wait.ignoreAll(Collection of Exceptions);
	    //  wait.until(ExpectedCondition.elementToBeClikable(e));
	      
	      
	          

         
	      
	     
	     
	   }
	}
	


