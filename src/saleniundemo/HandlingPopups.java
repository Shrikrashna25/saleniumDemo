package saleniundemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingPopups {

	public static void handlingpopups() {
		ChromeOptions options = new ChromeOptions();
		// options.addPreference("dom.webnotifications.enabled",false);

		options.addArguments("--disable-notification");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.justdial.com/");

	}

	public static void main(String[] args) {
		handlingpopups();

	}

}
