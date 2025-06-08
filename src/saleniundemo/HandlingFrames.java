package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFrames {
	public static void main(String[] args) {
		handlingFramesUsingSaleniun();
	}

	private static void handlingFramesUsingSaleniun() {
		ChromeDriver driver =new ChromeDriver();	
		driver.get("file:///F:/Java%20Study/Assigment/FrameDemo.html");
		driver.switchTo().frame(0);// Target focus on Inner Frame(0)
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Shrikrashna");
		driver.switchTo().frame(0);// Target focus in Inner frame in inner frame(0)
		driver.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("Gutte");
		driver.switchTo().parentFrame();// target focus inner frame to outer frame 
		driver.findElement(By.xpath("//button[@name=\"ok-btn\"]")).click();
		
	}


}
