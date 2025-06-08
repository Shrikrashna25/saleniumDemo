package saleniundemo;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageSrollDownScreenAshot {
	
	public static void FullPageScreenShotUsingAshot() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		AShot ashot = new AShot();
		Screenshot sc = ashot.shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		BufferedImage img = sc.getImage();
		try {
			ImageIO.write(img, "PNG", new File("full_page_screenshot.png"));
            System.out.println("Screenshot saved successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		FullPageScreenShotUsingAshot();

	}

}
