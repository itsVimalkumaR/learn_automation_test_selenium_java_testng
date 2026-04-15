package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EnterValueAndClickUsingJs {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/Register.php");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String username = "AutomationTester";

		js.executeScript("document.getElementById('username').setAttribute('value', arguments[0])", username);

		Object enteredValue = js.executeScript("return document.getElementById('username').getAttribute('value')");

		if ("AutomationTester".equals(enteredValue)) {
			System.out.println(enteredValue);
		} else {
			System.out.println("Not Matched");
		}

		js.executeScript("document.getElementById('Submit').click()");

		WebElement reset_btn = driver.findElement(By.id("Reset"));
		reset_btn.click();
//        js.executeScript("arguments[0].click()", reset_btn);

		Object resetedValue = js.executeScript("return document.getElementById('username').getAttribute('value')");

		if ("".equals(resetedValue)) {
			System.out.println("Should cleared");
		} else {
			System.out.println("Not cleared");
		}

		driver.quit();
	}
}
