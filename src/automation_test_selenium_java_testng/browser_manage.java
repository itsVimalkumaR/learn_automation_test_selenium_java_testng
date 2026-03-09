package automation_test_selenium_java_testng;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class browser_manage {

	public static void main(String[] args) throws InterruptedException {
		
		// Open Browser
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		// Delete all cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
		// Set size of the window
		Dimension size = new Dimension(375, 667);
		driver.manage().window().setSize(size);
		Thread.sleep(8000);
		
//		// Set position of the window
//		Point name = new Point(0, 0);
//		driver.manage().window().setPosition(name);
//		Thread.sleep(8000);
//		
//		
//		// Maximize the window
//		driver.manage().window().maximize();
	}
}
