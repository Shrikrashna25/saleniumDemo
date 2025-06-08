package saleniundemo;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotRobotClass {

	public static void ScreenShotUsingRobotClass() throws AWTException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		Rectangle rect= new Rectangle(1800,1169);
		BufferedImage img = robo.createScreenCapture(rect);
		File outputFile = new File("output.png");
		ImageIO.write(img, "png", outputFile);
	}
	
	public static void mouseHoverUsingRobot() throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Robot robo = new Robot();
		robo.mouseMove(294, 150);
	}
	public static void main(String[] args) throws AWTException, IOException {
		ScreenShotUsingRobotClass();

	}

}
