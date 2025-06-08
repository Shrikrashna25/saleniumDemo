package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// handling static table all employ salary is print
public class HandlingStaticTables {

	public static void handlingStaticTableData() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		int rows = driver.findElements(By.tagName("tr")).size();
		System.out.println(rows);
		
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j <= 6; j++) {
				String Data = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(Data + "\t");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		handlingStaticTableData();

	}

}
