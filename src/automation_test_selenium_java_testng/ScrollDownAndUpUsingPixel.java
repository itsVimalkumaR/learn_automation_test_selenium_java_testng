package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownAndUpUsingPixel {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Test_automation");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		JavascriptExecutor js = driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("Framework")));
		
//		for(int i = 0; i < 10; i++) {
//			js.executeScript("window.scrollBy(0, 50)");
//			Thread.sleep(2000);
//		}
//		
//		System.out.println("Success: Script to scroll down the window upto 50px for 10 times");
//		Thread.sleep(5000);
//		
//		for(int i = 0; i < 10; i++) {
//			js.executeScript("window.scrollBy(0, -50)");
//			Thread.sleep(2000);
//		}
//		System.out.println("Success: Script to scroll up the window upto 50px for 10 times");
	}
}
