package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions_MoveToElementAndClick {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement courses_menu = driver.findElement(By.linkText("COURSES"));
		Actions action = new Actions(driver);
		
		action.moveToElement(courses_menu).perform();
		
		TakesScreenShot_Example tk = new TakesScreenShot_Example();
		TakesScreenShot_Example.takeScreenshot("./Screenshots/MouseHovered.png", driver);
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='COURSES']/following-sibling::ul/li[.='Selenium']")).click();
		action.click(driver.findElement(By.xpath("//a[text()='COURSES']/following-sibling::ul/li[.='Selenium']"))).perform();
		TakesScreenShot_Example.takeScreenshot("./Screenshots/ActionClicked.png", driver);
		driver.close();
	}
	
}
