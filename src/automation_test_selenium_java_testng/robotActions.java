package automation_test_selenium_java_testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("https://www.google.com/"); 
		 
		  Actions action = new Actions(driver);
		  Robot robot = new Robot();
		 
//		  WebElement gmail = driver.findElement(By.linkText("Gmail")); 
		   
		  Thread.sleep(2000);
		  
		  robot.keyPress(KeyEvent.VK_TAB);
		  robot.keyRelease(KeyEvent.VK_TAB);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
