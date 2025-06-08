package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExicutor {
	
	public static void clickUsingJavaScriptExicutor(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");// click=> to click
		driver.manage().window().maximize();
		driver.executeScript("document.querySelector(\"a[href='/bus/']\").click();");
		
	}
	public static void sendKeysUsingJSExicutor() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");// value=> sendKeys
		driver.manage().window().maximize();
		//driver.executeScript("document.querySelector(\input.loginCont_input\").value=\"gutte\";");
	}
	public static void scrollWindow() {
		ChromeDriver driver = new ChromeDriver();// Scroll Window 
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"sc-jlZhew inxprl\"]")).click();
		driver.executeScript("window.scrollBy(0,300);");
		
	}

	public static void main(String[] args) {
		
		scrollWindow();
	}

}
