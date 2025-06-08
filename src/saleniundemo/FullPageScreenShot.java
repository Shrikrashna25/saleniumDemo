package saleniundemo;
// full page screen shot using Ashot
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class FullPageScreenShot {

	public static void FullPageScreenShotUsingAshot() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		AShot ashot = new AShot(); 
		Screenshot sc = ashot.takeScreenshot(driver);
		BufferedImage img = sc.getImage();
		try {
			ImageIO.write(img, "png", new File("usingAshot.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

	public static void main(String[] args) throws IOException{
		FullPageScreenShotUsingAshot();

	}

}
