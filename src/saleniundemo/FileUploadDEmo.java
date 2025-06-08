package saleniundemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDEmo {
	
	public static void fileUpload() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/file-upload-assignment/");
		
		driver.findElement(By.xpath("//input[@type=\"File\"]")).sendKeys("C:/Users/Admin/Desktop/TC.xlsx");
		
		
	}

	public static void main(String[] args) {
		fileUpload();

	}

}
