package automation_test_selenium_java_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesMultiElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		List<WebElement> lang_locators = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		System.out.println("Multi-Elements: " + lang_locators);

		for (WebElement lang : lang_locators) {
			System.out.println(lang.getText());
		}

		driver.close();
	}
}
