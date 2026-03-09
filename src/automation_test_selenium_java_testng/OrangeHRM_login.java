package automation_test_selenium_java_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_login {

	public static void main(String[] args) throws Exception{
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		WebElement username_textfield = driver.findElement(By.name("username"));
		username_textfield.sendKeys("Admin");
		
		WebElement pwd_txtbox = driver.findElement(By.name("password"));
		pwd_txtbox.sendKeys("admin123");
		
		Thread.sleep(3000);
		WebElement login_btn = driver.findElement(By.xpath("//button[@type='submit']"));
		login_btn.submit();
		System.out.println("Successfully logged in...");
	
	}
}
