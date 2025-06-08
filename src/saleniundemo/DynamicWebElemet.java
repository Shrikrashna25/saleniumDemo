package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebElemet {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/92390/nz-vs-eng-1st-test-england-tour-of-new-zealand-2024"); 
		 driver.manage().window().maximize();
		 String msg= driver.findElement(By.xpath("//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/child::div[7]")).getText();
         System.out.println(msg);
	}

}
