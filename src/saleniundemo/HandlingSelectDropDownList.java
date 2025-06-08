package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectDropDownList {

	public static void handlingSingleSelectDropDonwList() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///F:/Java%20Study/Assigment/DropDown.html");
		WebElement monthList = driver.findElement(By.xpath("//select[@class=\"single-select\"][5]"));
		Select select = new Select(monthList);
		select.selectByVisibleText("October");

	}

	public static void main(String[] args) {

		handlingSingleSelectDropDonwList();

	}

}
