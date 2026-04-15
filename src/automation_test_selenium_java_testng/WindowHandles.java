package automation_test_selenium_java_testng;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.bank.in/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		driver.findElement(By.xpath("//a[@title='NetBanking']")).click();

		String parent = driver.getWindowHandle();

		for (String win : driver.getWindowHandles()) {
			if (!win.equals(parent)) {
				driver.switchTo().window(win);
				break;
			}
		}

		driver.switchTo().frame("login_page");
		
		
//        String heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'NetBanking')]"))).getText();
		String heading = driver.findElement(By.xpath("//div[contains(text(),'Welcome to HDFC Bank NetBanking')]"))
				.getText();

		System.out.println(heading);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("fldLoginUserId"))).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("123456789");

		int beforeClick = driver.getWindowHandles().size();

		driver.findElement(By.xpath("//a[contains(text(),'Retail Loan')]")).click();

		Thread.sleep(2000);

		int afterClick = driver.getWindowHandles().size();

		if (afterClick > beforeClick) {
		    // New window opened
		    for (String win : driver.getWindowHandles()) {
		    	System.out.println("---> "+win);
		        driver.switchTo().window(win);
		    }
		} else {
		    // Same window navigation
		    System.out.println("No new window opened");
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals(title, "Nb Login");
		

	}
}