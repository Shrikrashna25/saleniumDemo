package saleniundemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ExpliciteWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///F:/Java%20Study/Assigment/Waits%20Assignment.html");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(250));
		wait.withMessage("Elementb dint appear in time out");
		wait.ignoring(ElementNotInteractableException.class);
		// wait.ignoreAll(Collection of Expection); //array List collection,or any other collection
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Shrikrashna");
		WebElement e = driver.findElement(By.xpath("//button[@id=\"btn-1\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(e));
		driver.findElement(By.xpath("//button[@id=\"btn-1\"]")).click();
		String Msg = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		System.out.println(Msg);
		driver.findElement(By.xpath("//button[text()='Button2']")).click();
		String Masg = driver.findElement(By.xpath("//p[@id=\"demo2\"]")).getText();
		System.out.println(Masg);

	}

}
