package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@role='link']/self::a[contains(@href,'/recover/initiate')]")).click();
		driver.findElement(By.xpath("//label[.='Mobile number or email address']/preceding-sibling::input")).sendKeys("test@example.com");
		
		
	}
}
