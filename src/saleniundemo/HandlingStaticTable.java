package saleniundemo;
// handling Static table
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticTable {
	
	public static void handlingStaticTable() {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		String salary =driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")).getText();
		String cierra =driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]")).getText();
	System.out.println("kiara salary"+salary+",  ciera salary"+cierra);
	
	}

	public static void main(String[] args) {
		handlingStaticTable();

	}

}
