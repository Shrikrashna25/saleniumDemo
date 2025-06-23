 package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicTable {

	public static void handlingDynamic() {

		ChromeDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table");
         int rows = driver.findElements(By.tagName("tr")).size();
		// System.out.println(rows); // 5
		for (int i=1; i<=rows; i++) {
			String Proces = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
         if(Proces.equalsIgnoreCase("Chrome")) {
				int cols = driver.findElements(By.xpath("//table/thead/tr/th")).size();
				for (int j=2; j<=cols; j++) {
					String colName = driver.findElement(By.xpath("//table/thead/tr/th["+j+"]")).getText();

					if (colName.equalsIgnoreCase("CPU")) {
						String value = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]"))
								.getText();
						System.out.println("CPU Usage of chrome::" + value);
						break;
					} else {
						continue;
					}

				}
				break;
			} else {
				continue;
			}
		}

	}
		public static void main(String[] args) {
			handlingDynamic();
		}
}
