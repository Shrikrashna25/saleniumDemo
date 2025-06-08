package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingStratergi {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//1. ID 
		driver.findElement(By.id("username"));	      //Locates element by its unique id attribute
		//2. Name	
		driver.findElement(By.name("email"));	       //Locates element by name attribute
		//3. Class Name	
		driver.findElement(By.className("btn-primary")); //   Locates by class attribute (not always unique)
		//4. Tag Name	
		driver.findElement(By.tagName("input"));	     // Locates by HTML tag name
		//5. Link Text	
		driver.findElement(By.linkText("Forgot Password?"));  //	Locates link by exact visible text
		//6. Partial Link Text	
		driver.findElement(By.partialLinkText("Forgot"));	//Locates link by partial text
		//7. CSS Selector	
		driver.findElement(By.cssSelector("input[type='email']"));	//Powerful and fast; based on CSS rules
		//8. XPath	
		driver.findElement(By.xpath("//input[@id='email']"));	//Flexible and supports navigating the DOM tree

		
		/////////////////////////////////////////////////////////////////////////////////////////
     
		// functions of xpath.
		
		
		//1.text()	//a[text()='Login'];
		driver.findElement(By.xpath("//a[text()='Login']"));
		//2.contains()	//input[contains(@name, 'user')]	
		//3.starts-with()	//input[starts-with(@id, 'user_')]	
		//4.last()	(//input)[last()]	
		//5.position()	(//div[@class='item'])[position()=2]	
		//6 normalize-space()	//span[normalize-space(text())='Welcome']	
		//7 not()	//input[not(@type='hidden')]	
		//count()	count(//input)	
		//name()	name(//div[@id='main'])
		//string-length()	//input[string-length(@value) > 5]
	}

}
