package saleniundemo;

//import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {
	
	


	
		public static void handlingWindow() {
			
			ChromeDriver driver =new ChromeDriver();
			driver.get("file:///F:/Java%20Study/Assigment/HandlingMultipleWindows.html");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			String ParentWindow =driver.getWindowHandle();// get handle parent Window
			System.out.println("Parent window handle::"+ParentWindow);//Print Parent window handle
			LinkedHashSet<String>handles=(LinkedHashSet<String>)driver.getWindowHandles();// get all window handle
			handles.remove(ParentWindow);// remove parentWindow handle
		    for (String handle : handles) { // use Each loop 
		    	driver.switchTo().window(handle);//switch to window providing title contains
		    	String Title =driver.getTitle(); // get title of window
		    	if(Title.contains("Fourth")) { // set First  Window title
		    		driver.findElement(By.xpath("//button[text()='Click Me']")).click();// click on button 
		    		break;
		    	}else {
		    		continue;
		    		
		    	}
				
			}
			
		}
		



	public static void m1() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()=\"New Tab\"]")).click();
		String parentHandle=driver.getWindowHandle();
		Set<String> allWindowHandle=driver.getWindowHandles();
		System.out.println(allWindowHandle);
		for (String handle : allWindowHandle) {
			String title=driver.switchTo().window(handle).getTitle();
			if(title.contains("Your Store")) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("laptop");
			}
		}
		System.out.println(driver.switchTo().window(parentHandle).getTitle());
}
		public static void main(String[] args) {
			handlingWindow();// call to Method
			m1();
		}

}
	
