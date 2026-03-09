package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActionsUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * 
		 * Thread.sleep(10000); WebElement un_txtbox =
		 * driver.findElement(By.xpath("//input[@placeholder='username']")); WebElement
		 * pwd_txtbox =
		 * driver.findElement(By.xpath("//input[@placeholder='password']"));
		 * 
		 * un_txtbox.sendKeys("Admin"); pwd_txtbox.sendKeys("admin123");
		 * 
		 * Thread.sleep(5000); un_txtbox.sendKeys(Keys.CONTROL, "ac");
		 * 
		 * Thread.sleep(5000); pwd_txtbox.sendKeys(Keys.CONTROL, "a");
		 * pwd_txtbox.sendKeys(Keys.CONTROL, "backspace");
		 * 
		 * Thread.sleep(5000); pwd_txtbox.sendKeys(Keys.CONTROL, "v");
		 */
		
		driver.get("https://the-internet.herokuapp.com/inputs");
		Thread.sleep(5000);
		
		WebElement num_textbox = driver.findElement(By.xpath("//input[@type='number']"));
		num_textbox.sendKeys("123");
		
		Thread.sleep(5000);
		num_textbox.sendKeys(Keys.CONTROL, "a");
		num_textbox.sendKeys(Keys.BACK_SPACE);
		
		Thread.sleep(5000);
		num_textbox.sendKeys("456");
		
	}
}
