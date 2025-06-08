package saleniundemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	
public static void handlingAlert() {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///F:/Java%20Study/Assigment/Confirmation_Alert.html");
		driver.findElement(By.tagName("button")).click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		String msg =alert.getText();
		System.out.println(msg);
}
		public static void main(String[] args) {
			handlingAlert();
		}
			
		{
	

}
}
