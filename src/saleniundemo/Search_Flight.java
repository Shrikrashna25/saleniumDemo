package saleniundemo;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Search_Flight {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.goibibo.com/"); 
		 driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();// close Pop up
		 driver.manage().window().maximize(); // maximize Window
		 driver.findElement(By.xpath("//div[@class=\"sc-12foipm-2 eTBlJr fswFld \"]")).click(); // Select tab From 
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::input")).sendKeys("Mumbai");// Enter Name
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // wait for searching name from list
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::li[1]")).click();// select name from given link
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::input")).sendKeys("Pune");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-24 bDSkOK\"]/descendant::li[1]")).click();
	     //driver.findElement(By.xpath("//p[@class=\"fswFld__title\"]")).click(); // Select Booking date Tab
	     //driver.findElement(By.xpath("//p[@class=\12 Oc]")).click(); // Select Booking date
	     driver.findElement(By.xpath("//div[@class=\"sc-12foipm-91 biWUTl\"]")).click();
	     driver.findElement(By.xpath("//span[@class=\"sc-12foipm-72 ezNmSh\"]")).click();
	  

	}

}
