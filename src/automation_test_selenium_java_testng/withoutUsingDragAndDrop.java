package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class withoutUsingDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("//li[@id='credit2']/a[contains(text(),'BANK')]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(source).moveToElement(dest).release().perform();
		action.contextClick();
	}
}
