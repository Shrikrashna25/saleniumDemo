package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassHandlingKeyborad {
	
	public static void HandlingKeyboardUsingActionClass() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB);
		act.keyUp(Keys.TAB);
		act.contextClick();// right click
		act.perform();
		

	}
public static void dragandDropUsingAction() {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://material.angular.io/cdk/drag-drop/examples");
	driver.manage().window().maximize();
	WebElement source=driver.findElement(By.xpath("//div[contains(text),'Get to work')]"));
	WebElement Destination=driver.findElement(By.xpath("//div[contains(text),'take a shower')]"));
	Actions act = new Actions(driver);
	act.dragAndDrop(source, Destination);
	act.perform();
}
	public static void main(String[] args) {
		dragandDropUsingAction();

	}

}
