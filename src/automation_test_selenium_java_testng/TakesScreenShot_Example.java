package automation_test_selenium_java_testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot_Example {
	
//	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("example@gmail.com");
		
		takeScreenshot("./ScreenShots/login.png", driver);
		
		driver.close();
	}

	public static void takeScreenshot(String file_name, WebDriver driver) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(file_name));
		System.out.println("Successfully take screnshot image.");
	}
	
}
